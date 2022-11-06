package br.edu.ifmt.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudantes")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id; 
	
	@Column(name = "primeiro_nome", nullable =  false)
	String primeiroNome;
	@Column(name = "ultimo_nome", nullable =  false)
	String ultimoNome;
	@Column(name = "email", nullable =  false)
	String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student( String primeiroNome, String ultimoNome, String email) {
		super(); 
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
	}
	
	public Student( ) { 
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome + ", email="
				+ email + "]";
	}
 

}
