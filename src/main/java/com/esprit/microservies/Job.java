package com.esprit.microservies;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2213080354769962186L;
	
	
	@Id
	@GeneratedValue
	private int id;
	private String service;
	private Boolean etat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Job() {
		super();
	}
	public Job( String service, Boolean etat) {
		super();
		
		this.service = service;
		this.etat = etat;
	}
	public Job(int id, String service) {
		super();
		this.id = id;
		this.service = service;
	}
	
	
	

}
