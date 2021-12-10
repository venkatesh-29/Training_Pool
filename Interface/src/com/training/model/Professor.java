package com.training.model;

import com.training.ifaces.Conditional;

public class Professor implements Conditional {

	private int id;
	private String qualification;
	/**
	 * 
	 */
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param qualification
	 */
	public Professor(int id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.qualification.equalsIgnoreCase("mca");
	}

}
