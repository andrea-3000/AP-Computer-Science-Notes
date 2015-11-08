package petAP;
import java.util.ArrayList;

public class Kennel {

	private ArrayList petList;

	public Kennel() {
		petList = null;
	}

	public void allSpeak() {

		for(int i = 0; i < petList.size(); i++) {
			Pet pet = (Pet)petList.get(i);
			System.out.println(pet.getName() + " " + pet.speak());
		}
	}
}
