package com.fidelity.training;

public class sample {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Employee Vinay = new Employee ();
		//Employee Vinay1 = new Employee ("a866587","Vinay","a866587@fmr.com");  
		
		Vinay.setCorpId("a866587");
		Vinay.setName("Vinay");
		Vinay.setEmail("a866587@fmr.com");
		
		
		Vinay.work();
		Vinay.printDetails();
		Vinay.Training();
		
		System.out.println("");
		System.out.println("UseEmployee Class");
		UseEmployee(Vinay);
		
		System.out.println("");
		//Vinay1.work();
		//Vinay1.printDetails();
		
		Employee Developer = new Developer();
		Developer.work();
		Developer.Training();
		
		Employee Manager = new Manager();
		Manager.work();
		Manager.Training();
		
	}
		
		public static void UseEmployee(Employee employee) {
			employee.work();
		}

}


