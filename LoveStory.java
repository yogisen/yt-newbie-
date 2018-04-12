import java.util.Random;

public class LoveStory {

	public static void main(String[] args) {
		System.out.println("do u know that i love u my honey ?");
		
		Random random = new Random();
		boolean succes = random.nextBoolean();
		
		
		System.out.println("hummmmmmmmmmmmmmm");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				if (succes) {
					System.out.println("i love u too honey");
				} else {
					System.out.println("what are you saying how dare you ");
				}
		
	}

}
