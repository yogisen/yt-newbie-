import java.util.ArrayList;

public class ArrayListLectureBis {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("un mot");
		array.add("des mots");
		array.add("s");
		array.add("un mot");

		array.add("m");

		for (String unmot: array) {
			System.out.println(unmot);
			
		}
		// renvoie true si le mot est prenset
		System.out.println(array.contains("un mot"));	
		// indique dans quel case se trouve le mot en partant du debut //affiche -1 si element non present
		System.out.println(array.indexOf("un mot"));	
		System.out.println(array.indexOf("unmot"));	
/*
 * un mot
des mots
s
un mot
m
true
0
-1
 */


	}

}
