package br.com.etechoracio.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CATEGORIA")
public class Categoria {

	@Id
	@GeneratedValue
	@Column(name = "ID_CATEGORIA")
	private Long ID;

	@Column(name = "TX_DESCRICAO")
	private String descricao;

}
