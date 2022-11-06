package br.edu.ifmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifmt.models.Student;
import br.edu.ifmt.repository.CrudEstudantes;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	
	@Autowired
	CrudEstudantes est; 

	@Override
	public void run(String... args) throws Exception {

		est.save(new Student("Jacinto José", "Franco", "geekaia@gmail.com"));
		est.save(new Student("Ana", "Clara", "ana@gmail.com"));
		est.save(new Student("João", "Silva", "joaos@gmail.com"));
		est.save(new Student("Gabriel", "Orlando", "gabrielo@gmail.com"));
		est.save(new Student("Júlia", "Silva", "anas@gmail.com"));
		est.save(new Student("Carlota", "Joaquina", "carlotjoaq@gmail.com"));
		
		
		
	}

}
