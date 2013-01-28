public class NumberReader {
	public static void main(String[] args) {
		int[] number = new int[10];
		for (int i=0 ; i<10 ; i++) {
			String tmp = System.console().readLine();
			number[i] = Integer.parseInt(tmp);
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.println(number[i]);
		}
	}
}
		
