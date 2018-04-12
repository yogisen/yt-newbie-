import java.util.Random;
import java.util.Scanner;

public class CapitaesGame {

	public static void main(String[] args) {
		
		final int NUMBER_OF_QUESTION = 7;
		int index;
		String pays, capitales;
		
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
		Scanner clavier = new Scanner(System.in);
		
		for (int i = 0; i < NUMBER_OF_QUESTION; i++) {
			
			// choisir de maniere aleatoire
			
			Random random = new Random();
			
			index = random.nextInt(data.length);
			pays = data[index][0];
			capitales = data[index][1];
			System.out.println();
			
			System.out.printf("quelle est la capitale de ce pays : %s?\n" , pays);
			
		}
	}

}
