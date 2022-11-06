package br.edu.ifmt.service.impl;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.edu.ifmt.models.Student;
import br.edu.ifmt.repository.CrudEstudantes;
import br.edu.ifmt.service.StudentService; 

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	CrudEstudantes stdman; 
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) stdman.findAll();
	}

	@Override
	public Student salvarEstudante(Student student) {
		// TODO Auto-generated method stub
		return stdman.save(student);
	}

	@Override
	public Iterable<Student> getAllStudents(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		//return stdman.findByOrderByIdAsc(PageRequest.of(offset,pageSize));
		return stdman.findByOrderByPrimeiroNomeAsc(PageRequest.of(offset,pageSize));
	}

	@Override
	public long getTotal() {
		// TODO Auto-generated method stub
		return stdman.count();
	}

	@Override
	public Optional<Student> findStudentId(Long id) {
		// TODO Auto-generated method stub
		return   stdman.findById(id);
	}

	@Override
	public void remStudentId(Long id) {
		// TODO Auto-generated method stub
		  stdman.deleteById(id);
	}

	 
	 
	 

}
