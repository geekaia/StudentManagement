package br.edu.ifmt.repository;

 
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository; 
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.edu.ifmt.models.Student;

@RepositoryRestResource(collectionResourceRel = "est", path = "est")
public interface EstudanteRepository extends PagingAndSortingRepository<Student, Long> { 
	Page findAll(Pageable pageable);
}
	