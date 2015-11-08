package randomDie;

public class DieRoller {

	public static void main(String[] args) {
		
		final int ROLLS = 100;
		
		int roll1 = 0;
		int roll2 = 0;
		int roll3 = 0;
		int roll4 = 0;
		int roll5 = 0;
		int roll6 = 0;
		int thisRoll;
		
		RandomDie myDie = new RandomDie(6);
		
		for (int i = 0; i < ROLLS; i ++) {
		
			thisRoll = myDie.rollDie();
			switch(thisRoll) {
				case 1: roll1++; break;
				case 2: roll1++; break;
				case 3: roll1++; break;
				case 4: roll1++; break;
				case 5: roll1++; break;
				case 6: roll1++; break;
				
			}
			System.out.println("This roll is ");
			
		}
		
		
	}
	
}
