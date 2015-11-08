package horseAP;

public class HorseBarn {

	private Horse[] spaces;
	
	public HorseBarn() {
		spaces = null;
	}
	
	public int findHorseSpace(String name) {
		boolean found = false;	
		int space = -1;
		int i = 0;
		
		while(i < spaces.length && !found) {
			if(spaces[i].getName() == name) {
				found = true;
				space = i;				
			}
			i++;
		}
		
		/**AP SOLUTION**/
//		for (int i = 0; i < this.spaces.length; i++) {
//			if (this.spaces[i] != null && name.equals(this.spaces[i].getName())) {
//				return i;
//			}
//		}
//		return -1;
		
		return space;
		
	}
	
	public void consolidate() {
		int whereNull = -1;

		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] == null && (spaces[whereNull] != null || whereNull == -1)) {
				whereNull = i;
			} else if (whereNull != -1){
				spaces[whereNull] = spaces[i];
			}
		}
		
		/** AP SOLUTION**/
//		for (int i = 0; i < this.spaces.length-1; i++) {
//			if (this.spaces[i] == null) {
//				for (int j = i+1; j < spaces.length; j++) {
//					if (this.spaces[j] != null) {
//						this.spaces[i] = this.spaces[j];
//						this.spaces[j] = null;
//						j = this.spaces.length;
//					}
//				}
//			}
//		}
	}
	
	//there may be instance variables, constructors, and methods that are not shown
}
