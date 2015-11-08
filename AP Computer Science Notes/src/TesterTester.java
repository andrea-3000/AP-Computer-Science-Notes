import java.util.ArrayList;


public class TesterTester {

	public static void main(String[] args) {
		
		/** 11/17 **/
			/*for (int i = 0; i < 15; i++) {
				i += i;
				System.out.println(i);
			}*/
		
		/** 11/19 **/
			/*Scanner in = new Scanner(System.in);
			int sum = 0;
			boolean done = false;
			String userIn = in.next();
			
			while (!done) {
				System.out.println("Please input an integer - ");
				System.out.println("Q to quit");
				
				if (userIn.equalsIgnoreCase("Q")){
					done = true;
					System.out.println("Total is " + sum);
				} else {
					int value = Integer.parseInt(userIn);
					sum += value;
					System.out.println("Total is " + sum);
				}
			}*/
		
		/** 12/1 **/
			/*int[] nums;
			nums = new int[10];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = i;
			}
			
			for (int i = 0; i < nums.length; i++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			
			int[] newNums = {
				10, 22, 34, 76, 98, 22, 36, 1098, 3457, 43	
			};
			
			System.out.println(newNums.length);
			*/
		
		/** 12/2 **/
			/*String[] str = {
					"Hello", "is", "it", "me", "you're", "looking", "for"
			};
			System.out.println(str[0]);
		
			int[] data = new int[10];
			
			for (int i = 0; i < data.length; i ++) {
				System.out.println(data[i]);
			}*/
		
		/** 12/4 **/
			/*int[] array = new int[5];
			System.out.println(array);
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(70);
			list.add(32);
			System.out.println(list);*/
		
		/** 12/11 **/
			/*int[] data = new int[9];
			boolean exist = false;
			
			for (int i = 0; i < data.length; i++) {
				if (data[i] == 7) {
					exist = true;
				}
			}
			
			
			//FOR ARRAYLIST
			ArrayList<Integer> list = new ArrayList();
			exist = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == 7) {
					exist = true;
				}
			}
			
			exist = false;
			for (Integer element : list) {
				if (list.get(element) == 7) {
					
				}
			}*/
		
		/** 12/15 **/
			//WRITE CODE TO COPY DATA IN AN ARRAY OF INTS
			ArrayList<Integer> data = new ArrayList();
			
			int[] ints = new int[data.size()];
			
			for (int i = 0; i < ints.length; i++) {
				ints[i] = data.get(i);
			}
			
			//WRITE CODE TO GENERATE A PERMUTATION OF {1...10} in an array perm of length 10.
			int[] perm = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			int[] newPerm = new int[perm.length];
			
			for (int i = 0; i < newPerm.length; i++) {
				
			}
	}
	
}
