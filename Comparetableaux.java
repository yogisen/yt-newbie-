
public class Comparetableaux {

	public static void main(String[] args) {
		
		int[] tab1 = {1,2,3};
		int[] tab2 = {1,5,3};
		
		if (tab1.length != tab2.length) {
			System.out.println("Differents1");
		} else {
			int i = 0;
			while( i < tab1.length && tab1[i] == tab2[i]) {
				++i;
				System.out.println("identifque1");
			}
			System.out.println("identique2");
			
			if ( i >= tab1.length) {
				System.out.print("identique 3");
				} else {
					System.out.println("Differents2");

				}
			
			
/*
 * identifque1
identique2
Differents2
			
 */
			
			

			
		}

	}

}
