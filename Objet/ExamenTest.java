package com.yogisen.javainteremdiaire;
import java.util.Scanner;
public class ExamenTest {

	public static void main(String[] args) {
		
		int answer2 = 4;
		// string answer 1
				
			Scanner keyboard = new Scanner(System.in);
			 Examen examen = new Examen();
			 examen.printMessage("programmation");
			 examen.durationOfProof(120);
			 
			 System.out.println("Java is difficult program ? ");
			 String answer1 = keyboard.nextLine();
			 if (answer1 != "no") {
				 System.out.println(" this answer was no"); 
			 
			 examen.question1(answer1);
			 
			do {
				System.out.println(" how much 2 * 2 ");
					 answer2 = keyboard.nextInt();
				 if (answer2 !=4)
					 System.out.println(" it's not possible please try again ");
				 examen.question2(answer2);
			} while  (answer2 != 4);
		 
			 examen.thx();
			 examen.goodbye();
			 
			
				
			}
						 
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