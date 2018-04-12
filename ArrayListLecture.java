import java.util.ArrayList;

public class ArrayListLecture {

	public static void main(String[] args) {
		
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		// add ajoute une donnée
		
		tab.add(5);
		System.out.println("valeur à l'emplacement 0 du tableau est : "+tab.get(0));
		System.out.println("taille du tableau = "+tab.size());
		
		// set modifie une donnée
		tab.set(0, 12);
		
		System.out.println("valeur à l'emplacement 0 du tableau est : "+tab.get(0));
		
		tab.add(5);
		tab.add(105);
		tab.add(52);
		System.out.println("taille du tableau = "+tab.size());
		
		
		//efface le tableau
		//tab.clear();
		// efface l'emplacement 0
		tab.remove(0);
		
		if (tab.isEmpty()) {
			System.out.println(" tableau vide  ");

		}else {
			
		}		
		System.out.println("taille du tableau = "+tab.size());
		//System.out.println("valeur à l'emplacement 0 du tableau est : "+tab.get(0));


		/*RESULTAT
		 * valeur à l'emplacement 0 du tableau est : 5
taille du tableau = 1
valeur à l'emplacement 0 du tableau est : 12
taille du tableau = 4
taille du tableau = 3
		 */



		
	}

}
