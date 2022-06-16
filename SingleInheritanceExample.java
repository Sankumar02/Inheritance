package com.Inheritance;

class Person{
	private int age;
	String name;
	
	
	public void setage(int Age) {
		age=Age;
	}
	public int getage() {
		return age;
	}
	public void setStudentData(String Name) {
		
		name=Name;		
	}
	void showStudentDetails() {
		System.out.println("Name = "+name);
		
	}
}
class Employee extends Person{
	private String designation;
public void setdesingnation(String Designation) {
	designation=Designation;
}
public String getdesignation() {
	return designation;	
}
}
public class SingleInheritanceExample {
 public static void main(String []args) {
	 Employee empData=new Employee();
	 empData.setage(23);
	 empData.setdesingnation("HR");
	 empData.setStudentData("Kumar");
	 empData.showStudentDetails();
	 System.out.println("Age :"+empData.getage());
	 System.out.println("Designatio :"+empData.getdesignation());
 }
}
