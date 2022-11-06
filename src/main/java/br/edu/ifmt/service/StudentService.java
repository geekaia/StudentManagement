package br.edu.ifmt.service;

import java.util.List;
import java.util.Optional;

import br.edu.ifmt.models.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student salvarEstudante(Student student);
	
	Iterable<Student> getAllStudents(Integer pageSize,Integer offset);
	
	long getTotal();
	
	Optional<Student> findStudentId(Long id); 
	
	
	void remStudentId(Long id); 
}
