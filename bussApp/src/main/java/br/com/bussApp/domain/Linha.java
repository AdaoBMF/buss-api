package br.com.bussApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "linhas")
public class Linha {

	@Id
	private String id;
	
	@Column(length = 4, nullable = false)
	private String codigo;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
}
