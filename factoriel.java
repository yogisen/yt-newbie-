
public class factoriel {

	public static void main(String[] args) {

		System.out.println(factoriel(3));
		
	}
	static int factoriel (int n) {
		if (n == 0 || n ==1) {
			return 1;
		}else {
			return n * factoriel (n-1);
		}
	}

}
