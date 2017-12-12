package com.fidelity.training;

public class Employee {
	
	private String corpId;
	
	private String name;
	
	private String email;

	
	//Getters	
	public String getCorpId() {
		return corpId;
	}

	//Setters
	public void setCorpId(String corpId) {
		if (!corpId.contains("a")) {
			throw new RuntimeException("Corp Id doesnt contain a");
		}
		
		this.corpId = corpId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Parameterized constructor
	public Employee(String Id, String empName, String emailId){
		corpId = Id;
		name = empName;
		email = emailId;
	}
	
	//Default constructor
	public Employee() {
		corpId = "a000000";
		name = "noname";
		email = "default@fmr.com";
	}
	
	public void work(){
		System.out.println("Employee : Working");
	}
	
	public void printDetails(){
		System.out.println(corpId);
		System.out.println(name);
		System.out.println(email);
	}
	
	public void Training(){
		System.out.println("Employee is getting trained");
	}

}
