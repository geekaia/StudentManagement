package br.edu.ifmt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifmt.models.Student;


public interface CrudEstudantes extends PagingAndSortingRepository<Student, Long> {
	
	long count();
	
	Page findByOrderByIdAsc(Pageable pageable);
	Page findByOrderByPrimeiroNomeAsc(Pageable pageable);
	
	
	

}
