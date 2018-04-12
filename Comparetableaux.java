
public class Comparetableaux {

	public static void main(String[] args) {
		
		int[] tab1 = {1,2,3};
		int[] tab2 = {1,2,3};
		
		if (tab1.length != tab2.length) {
			System.out.println("Differents");
		} else {
			int i = 0;
			while( i < tab1.length && tab1[i] == tab2[i]) {
				++i;
				System.out.println("same Board");
			}
			System.out.println("same Board test");

			
		}

	}

}
