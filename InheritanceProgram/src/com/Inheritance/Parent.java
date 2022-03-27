package com.Inheritance;

public class Parent extends Child
 {
	//object declaration
	String name;
	int age;
	static String town;
	//constructor creation
	public void parent()
	{
		
	}
	public void Details()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(town);
	}
	public static void main(String[] args) {
		
		Parent parent=new Parent();
		parent.name="kani";
		parent.age=4;
		Parent.town="aaa";
		parent.Details();// method in current class
		System.out.println("***************");
		//child class object creation
		Child ch=new Child();
		ch.mob=89776;
		ch.Details();//method in another class with same name different behaviour
		}
}
