package randomDie;

public class RandomDie {
	
	private int range;

	public RandomDie(int r) {
		range = r;
	}
	
	public int rollDie() {
		return range;
	}
	
	private static String printStars(int tally) {
		
		final int FACTOR = 1;
		final String STAR = "*";
		String result = "";
		int i = tally;
		
		while(i > 0) {
			result += STAR;
			i -= FACTOR;
		}
		
		return result;
		
	}
	
}
