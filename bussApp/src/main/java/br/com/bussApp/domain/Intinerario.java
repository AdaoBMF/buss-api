package br.com.bussApp.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "intinerarios")
public class Intinerario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@ManyToMany(targetEntity = br.com.bussApp.domain.Ponto.class, mappedBy = "Intinerario")
	private List<Ponto> pontos;
	
	@OneToMany()
	@JoinColumn(name = "idLinha" , nullable = false)
	private String idlinha;

	@Column
	@JoinColumn(name = "nomeLinha" , nullable = false)
	private String nome;

	@Column
	@JoinColumn(name = "codigoLinha" , nullable = false)
	private String codigo;
}
