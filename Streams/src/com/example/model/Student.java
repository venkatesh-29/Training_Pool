package com.example.model;

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String studentName;
	private double markScored;
	
	public Student() {
		super();

	}

	public Student(int rollNumber, String studentName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.markScored = markScored;
	}

	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the markScored
	 */
	public double getMarkScored() {
		return markScored;
	}

	/**
	 * @param markScored the markScored to set
	 */
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
				+ "]";
	}

	@Override 
	public int compareTo(Student obj) {
		if(obj.markScored<this.markScored)return -1;
		if(obj.markScored>this.markScored)return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(markScored);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rollNumber;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(markScored) != Double.doubleToLongBits(other.markScored))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
	
	
}
