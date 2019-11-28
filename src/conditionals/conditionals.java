package conditionals;

public class conditionals {

	public static int calc(boolean what, int number1, int number2) {
		int result = 0;
		if (what) {
			result = number1 + number2;
		} else {
			result = number1 * number2;
		}
		return result;
	}

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 100;
		boolean what = false;
		System.out.println(calc(what, number1, number2));
	}

}
