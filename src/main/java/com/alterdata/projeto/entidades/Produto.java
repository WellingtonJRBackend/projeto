package com.alterdata.projeto.entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false,unique = true,length = 100)
	private String nome;
	
	@Column(nullable = false,length = 25)
	private String preco;
	
	@Column(nullable = false,unique = true,length = 6)
	private String codigo;
}
