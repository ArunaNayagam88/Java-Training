package com.fidelity.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample2Day {
	
	public static void main (String[] args) {

		//Map
		Map<String, Employee> sampleMap = new HashMap<>();
		
		Employee employee1 = new Employee();
		employee1.setCorpId("a65445");
		Employee employee2 = new Employee();
		employee2.setCorpId("a54325");
		
		sampleMap.put("AA", employee1);
		sampleMap.put("BB", employee2);
		
		Employee retriveEmp = sampleMap.get("AA");
		System.out.println(retriveEmp.getCorpId());
		
		Set<String> keyList = sampleMap.keySet();  //Set is similar to List. Difference is it will not allow duplicate values
		
		for(String key:keyList){
			System.out.println(sampleMap.get(key).getCorpId());
		}
		
		
		//List
		/*List<String> nameList = new ArrayList<>();
		nameList.add("AA");
		nameList.add("Sha");
		
		for (int i =0;i <nameList.size();i++){
			String name = nameList.get(i);
			System.out.println(name);
		}*/
		
		
		//Array
/*		String[] names = new String[4];
		names[0] = "Ram";
		names[1] = "Peter";
		
		String[] nameList = {"AA","BB","CC","DD"};
		
		for (int i =0 ; i<names.length; i++){
			System.out.println(names[i]);
		}
		
		for (String name : names){
			System.out.println(name);
		}
		
		int index = 0;
		while (index<names.length){
			System.out.println(names[index]);
			index++;
		}
			
		int x=0;
		do {
			 System.out.println(names[x]);
			 x++;
		} while (x<names.length);*/
		
		
		// String operations
		/*String firstName = "Vinay";
		String secondName = new String ("Shanbhag");
		
		System.out.println(firstName.length());
		System.out.println(secondName.lastIndexOf("a"));
		System.out.println(firstName.concat(secondName));
		
		
		StringBuffer sb = new StringBuffer("Fidelity");
		sb.append("Investments").append(".ltd");
		
		System.out.println(sb);*/
	
	}


	// sample of condition stmt and operators
	/*public static void main (String[] args) {
		System.out.println("Enter the month");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i>=1 && i<=6){
			System.out.println("Month is first half");
		}
		
		else if (i>=7 && i<=12){
			System.out.println("Month is Second half");
		}
		else {
			System.out.println("Not a valid month");
		}
	
	}
*/
	
	
}
