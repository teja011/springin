package com.cg.assignment1;

public class Client {

	public static void main(String[] args) {
	
		SBU sbu = new SBU(111, "kiran rao", "Engineering services");
		
Employee e1 = new Employee(1111	, "Tejas", 15600, 22, sbu);

String s = e1.toString();
System.out.println(s);


	}

}
