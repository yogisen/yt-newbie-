package com.yogisen.javainteremdiaire;
import java.util.Scanner;
public class ExamenTest {

	public static void main(String[] args) {
				
			Scanner keyboard = new Scanner(System.in);
			 Examen examen = new Examen();
			 examen.printMessage("programmation");
			 examen.durationOfProof(120);
			 System.out.println("Java is difficult program ? ");
			 String answer1 = keyboard.nextLine();
			 examen.question1(answer1);
			 System.out.println(" 2*2 ");
			 int answer2 = keyboard.nextInt();
			 examen.question2(answer2);
			 examen.thx();
			 examen.goodbye();
						 
	}

}


/* ce que j'aimerai faire
	do {
			pose la question 1 et 2 
			si reponse != true || "non" && 4
			= relancer les questions
			
			je n'y arrive pas 
		} while (condition);
		
		*/



