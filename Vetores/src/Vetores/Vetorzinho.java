package Vetores;

public class Vetorzinho {

	public static void main(String[] args) {

		int vec[] = new int[5];

		int aux = 4;

		for (int i = 0; i < 5; i++) {
			vec[i] = aux;

			aux--;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor do vetor: " + vec[i]);

		}
	}

}