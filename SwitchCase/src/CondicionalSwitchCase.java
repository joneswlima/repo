import java.util.Scanner;

public class CondicionalSwitchCase {

	public static void main(String[] args) {
		
		int c = 0;
				
		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE A LOGOMARCA: ");
		c = sc.nextInt();
		switch(c){
		
		case 1:
		System.out.println("BANDEIRA RAIA");
		break;
		
		case 2:
		System.out.println("BANDEIRA DROGASIL");
		break;
		
		default:
		System.out.println("FARMASIL MORREU LOKO");
		break;
		}
	}

}
