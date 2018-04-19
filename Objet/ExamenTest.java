package com.yogisen.javainteremdiaire;

public class ExamenTest {

	public static void main(String[] args) {
		
		String test = "abc";
	 String name = " je suis une chaine de caractere";
	 String name1 = new String (" je suis une chaine de caractere 1");
	 
	 Examen examen = new Examen();
	 examen.afficherMessage();
	 examen.dureeDeLEpreuve();
	 examen.question1();
	 examen.question2();

	 System.out.println(name);
	 System.out.println(name1);
	}

}
