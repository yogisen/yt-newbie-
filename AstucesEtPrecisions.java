import java.util.Scanner;

public class AstucesEtPrecisions {

	public static void main(String[] args) {

		System.out.println("entrer un nombre compris entre 1 et 3");
		Scanner clavier = new Scanner(System.in);

		int number = clavier.nextInt();

		switch (number) {
		case 1:
			System.out.println("vs avez entre 1");
			break;
		case 2:
			System.out.println("vs avez entre 2");
			break;
		case 3:
			System.out.println("vs avez entre 3");
			break;

		default:
			System.out.println("entrer une valeur entre 1 et 3");
			break;
		}

		System.out.println("sysout ctrl espace");
		System.out.println();

		for (int i = 0; i < args.length; i++) {

		}
		System.out.println("for ctrl espace // int i = 0; i < args.length; i++");
		System.out.println(" creer un template scanner news scan ... windows preferences java editor ctrl sifr f");
	}

}
