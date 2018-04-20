package com.yogisen.javainteremdiaire;

public class Person {
	public String name;
	public String pseudo;
	public int QI;
	public int age;
	
	public Person(String name, String pseudo, int QI) {
		this.name = name;
		this.pseudo = pseudo;
		this.QI = QI;
		}
	public void setAge(int age) {
		if (age<18) {
			System.out.println(" You must have 18 years");
		}else {
			//this.age = age;
			System.out.println( "you have "+ age +"years");
		}
				
	}
	public void setQI(int QI) {
		this.QI = QI;
	}
	public int getAge() {
		return this.age;
	}
		public void Welcome(){
		System.out.println(" welcome" + name);
		System.out.println(pseudo);
		}
}