package ControlStatements;

public class ControlStatementDemo {

	public static void main(String[] args) {

		// ifDemo(5);
		// switchDemo(0);
		//loopDemo(55);
		breakDemo();
	}

	private static void ifDemo(int age) {

		if (age >= 10 && age < 20) {
			System.out.println("Age is between 10 and 20");
		} else if (age >= 20 && age < 30) {
			System.out.println("Age is between 20 and 30");
		} else if (age >= 30 && age < 40) {
			System.out.println("Age is between 30 and 40");
		} else {
			System.out.println("Age is more than 40");
		}
	}

	private static void switchDemo(int number) {
		int num = 2;
		switch (num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 1:
			System.out.println("number is 1");
			break;
		default:
			System.out.println(num);
		}
	}

	private static void loopDemo(int i) {
		do {
			System.out.println(i);
			i = i + 1;
		} while (i <= 10);
	}

	private static void breakDemo() {
		for (int i = 0; i <= 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}
	}

}
