public class NumberReader {
	public static void main(String[] args) {
		final int N = inputNumber();
		
		int[] number = new int[N];
		
		for (int i=0 ; i<N ; i++) {
			number[i] = inputNumber();
		}
		for (int item : number) {
			System.out.println(item);
		}
		
	}
	
	private static int inputNumber() {
		int n = 0;
		for(;;) {
			String tmp = System.console().readLine();
			try {
				n = Integer.parseInt(tmp);
				break;
			} catch (NumberFormatException ex) {
				System.err.println("Error - you did not enter an integer. Try another");
			}
		}
		return n;
	}
}
		
