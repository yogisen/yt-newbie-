import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CapitaesGame {

	public static void main(String[] args) {
		
		final int NUMBER_OF_QUESTION = 2;
		int score = 0, index;
		String pays, capitales, user_answer;
		
		ArrayList<Integer> indexexAlreadyTaken = new ArrayList<>();
		
		String [][] data = getData();
		
		Scanner clavier = new Scanner(System.in);
		
		for (int i = 0; i < NUMBER_OF_QUESTION; i++) {
			
			// choisir de maniere aleatoire
			
			
			do {
				Random random = new Random();
				index = random.nextInt(data.length);
			}while(indexexAlreadyTaken.contains(index));
			
			indexexAlreadyTaken.add(index);
			
			
			pays = data[index][0];
			capitales = data[index][1];
			System.out.println();
			
			System.out.printf("quelle est la capitale de ce pays : %s?\n" , pays);
			user_answer = clavier.nextLine();
			
			if(capitales.equalsIgnoreCase(user_answer)) {
				System.out.println("bonne reponse");
				score++;
			}else {
					System.out.printf("Mauvaise reponse. il fallait repondre %s\n.", capitales);
			}
		}
		System.out.printf("score est de %s\n",score);
		System.out.printf("autre affichage<<Score : %d/%d>> ", score, NUMBER_OF_QUESTION);
		clavier.close();
	}
	
	static String [][] getData(){
		 String [][] data = {
				{"Senegale", "Dakar"},
				{"France", "Paris"},
				{"Nigeria", "Lagos"},
				{"Gabon", "libreville"},
				{"Allemagne", "Berlin"},
				{"Monaco", "Monaco"},
				{"Perou", "Lima"},
				{"Italie", "Rome"},
				{"pays", "capitale"},
		};
		 return data;
	}

}
