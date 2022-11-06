package br.edu.ifmt.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifmt.models.Student;
import br.edu.ifmt.service.impl.StudentServiceImpl;

@Controller
public class StudentController {
	
	
	@Autowired
	StudentServiceImpl serv; 
	
	
	
	@GetMapping("/")
	public String olaMundo(Model model) {
		model.addAttribute("estudanteslist", serv.getAllStudents());
		
		
		return "estudantes";

	}
	
	
    @GetMapping("/getAll/{offset}")
    public String getAllProducts(@RequestParam Integer pageSize, @PathVariable("offset") Integer offset, Model model){
    	
    	model.addAttribute("estudanteslist", serv.getAllStudents(pageSize,offset));
    	List<Integer> totp = new ArrayList<>(); 
    	
    	Long quantp= serv.getTotal()/pageSize+1;
    	
    	for(int i=0; i< quantp; i++) {
    		totp.add(i);
    	}
    	
    	
    	model.addAttribute("total", totp);
    	model.addAttribute("pagesize", pageSize);
		
		return "estudantes"; 
    }
    
    
    
    @GetMapping("/edit/{id}")
    public String getAllProducts(@PathVariable("id") Long id, Model model){
    	
    	Optional<Student> std = serv.findStudentId(id); 
		model.addAttribute("estudante", std);
		
		return "edit"; 
    }
    

    
    @GetMapping("/remover/{id}")
    public String remover(@PathVariable("id") Long id, Model model){
    	
       serv.remStudentId(id);  
		
		return "redirect:/getAll/0?pageSize=2";
    }
    
    
	
	@GetMapping("/estudantes/novo")
	public String novoEstudnate(Model model) {
		
		Student std = new Student(); 
		model.addAttribute("estudante", std);
		
		return "novo";
	}
	
	@PostMapping("/estudantes/criar")
	public String criarNovoEstudante(@ModelAttribute("estudante") Student student) {
		
		serv.salvarEstudante(student);
		
		
		return "redirect:/getAll/0?pageSize=2";
	}
	
	
	
	
	

}
