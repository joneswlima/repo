import java.util.Scanner;

public class CondicionalIF {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("DIGITE A: ");
		a = sc.nextInt();

		System.out.print("DIGITE B: ");
		b = sc.nextInt();

		System.out.println("A = " + a + "\nB = " + b);
		if (a > b) {
			System.out.println("A MAIOR QUE B");

		} else if (a == b) {
			System.out.println("A IGUAL B");

		} else {
			System.out.println("A MENOR QUE B");

		}

	}
}
