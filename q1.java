import java.util.List;
import java.util.ArrayList;
public class q1 {
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		q1 launcher = new q1();
		launcher.launch(6);
	}
}
