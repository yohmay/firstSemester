package exercises;

public class Question6 {
	public static void main(String[] args) {
		int counter = 0;
		for (int j = 0; j < 10; j++) {
			counter = j;
			if ((counter + j) == 6) {
				System.out.println("Counter = " + counter);
			}
		}
	}
}
