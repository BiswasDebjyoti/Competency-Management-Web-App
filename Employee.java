package project;

import java.util.ArrayList;

public class Employee {
	private String name;
	private String role;
	private int id;
	private static int numberOfEmployee;
	private ArrayList<String> skills;
	private ArrayList<String> certificates;
	private ArrayList<String> training;
	
	public Employee(String name,String role,ArrayList<String> skills,ArrayList<String> certificates) 
	{
		this.setName(name);
		this.setRole(role);
		this.setId(Employee.numberOfEmployee++ + 1);
		this.setSkills(skills);
		this.setCertificates(certificates);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public ArrayList<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(ArrayList<String> certificates) {
		this.certificates = certificates;
	}

	public ArrayList<String> getTraining() {
		return training;
	}

	public void setTraining(ArrayList<String> training) {
		this.training = training;
	}
	
	public String toString(){
		String str = "Name : "+this.name+"\n" 
					+"Role :"+this.role+"\n"
					+"ID :"+this.id +"\n"
					+"Skills :"+this.skills+"\n"
					+"Certificates :"+this.certificates+"\n"
					+"Training :"+this.training;
						
		return str;
		
	}
}
