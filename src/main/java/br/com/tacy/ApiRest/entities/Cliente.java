package br.com.tacy.ApiRest.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 50)
	private String nome;

	@Column(nullable = false, length = 16, unique = true)
	private String cpf;

	@Column(nullable = false, length = 15, unique = true)
	private String rg;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dataNacimento;

	@Column(nullable = true, unique = false, length = 100)
	private String endereco;
	
	

}
