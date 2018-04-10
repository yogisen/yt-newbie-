import java.util.Scanner;

public class JeuPlusouMoins {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);

		int secretNumber, currentNumber;
		
		// secret nbr = nbr aleatoire entre 1 et 1000
		secretNumber = (int) (Math.random() *999)+1;
		
		
		do {
			System.out.println("entrer un nombre entre 1 et 1000");
			currentNumber = clavier.nextInt();
			
			if (currentNumber == secretNumber){
				System.out.println("u're a best");
			} else if (currentNumber > secretNumber){
				System.out.println("ton nombre est trop grand");
			} else {
				System.out.println("ton nombre est trop petit");
			}			
			
		// while tu continues tant que tu ne trouves pas le bon nbre	
		} while ( currentNumber != secretNumber);
		
		
		
	}

}
