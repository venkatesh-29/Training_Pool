package com.training.model;

import com.training.ifaces.Conditional;

public class Student implements Conditional {

	private int id;
	private double mark;
	
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param mark
	 */
	public Student(int id, double mark) {
		super();
		this.id = id;
		this.mark = mark;
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
	 * @return the mark
	 */
	public double getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.mark >70;
	}

}
