package com.yogisen.javainteremdiaire;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("DUPONT", "PSEUDO", 110);
		System.out.println(p1.name+p1.pseudo+ p1.QI );
		p1.Welcome();
		p1.age = 25;
		System.out.println(p1.age);
		p1.setAge(17);
		p1.setAge(20);
		System.out.println(" you have " +p1.getAge() );
		p1.setQI(100);
		System.out.println("use p1.age" +p1.age);
		System.out.println("use p1.QI" +p1.QI);
		System.out.println(p1.name+p1.pseudo+ p1.QI );
		
	}

}

/*
 * DUPONTPSEUDO110
 welcomeDUPONT
PSEUDO
25
 You must have 18 years
you have 20years
 you have 25
use p1.age25
use p1.QI100
DUPONTPSEUDO100


*/
