package com.myblog.blogapp.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.*; // remove the data 
import lombok.NoArgsConstructor;

@Data         // lombok@ (getter or setter) we can also use @getter and @setter instead of this use @data
@NoArgsConstructor // constructor no args 
@AllArgsConstructor // constructor all args
@Entity 
@Table(
				
		name = "posts" , 
		uniqueConstraints = {@UniqueConstraint(columnNames = {"tittle"})}
		
		)
public class POST {
	
	// real world entity describe in a database in a form of table structure. 
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name = "tittle" , nullable = false )
	private String tittle;
	
	@Column(name = "discription" , nullable = false)
	private String description;
	
	@Column(name = "content" , nullable = false)
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	

}
