package dev.exemple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Classe Exemple
 * 
 * @author Sandra Le Thiec
 *
 */
@Entity
@Table(name = "EXEMPLE")
public class Exemple {
	
	/* ATTRIBUTS */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "CHAMP_1")
	private String champ1;
	
	@Column(name = "CHAMP_2")
	private String champ2;
	
	/* CONSTRUCTEUR */
	/**
	 * Constructeur par défaut
	 */
	public Exemple() {}
	
	/* GETTERS ET SETTERS */
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the champ1
	 */
	public String getChamp1() {
		return champ1;
	}
	/**
	 * @param champ1 the champ1 to set
	 */
	public void setChamp1(String champ1) {
		this.champ1 = champ1;
	}
	/**
	 * @return the champ2
	 */
	public String getChamp2() {
		return champ2;
	}
	/**
	 * @param champ2 the champ2 to set
	 */
	public void setChamp2(String champ2) {
		this.champ2 = champ2;
	}
	
	

}
