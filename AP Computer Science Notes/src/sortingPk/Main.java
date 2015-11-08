package sortingPk;

public class Main {

	public static void main (String[] args) {
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		MergeSorter merger = new MergeSorter();
		SelectionSorter selector = new SelectionSorter();
		InsertionSorter insertor = new InsertionSorter();
		BubbleSorter bubbler = new BubbleSorter();
		
		merger.sort(numbers);
		selector.sort(numbers);
		insertor.sort(numbers);
		bubbler.sort(numbers);
	}
	
}
