package fundamentos3;
import java.util.Scanner;

public class exercArray04 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] arrayA = new int [10];
		int[] arrayB = new int [10];
		int[] arrayC = new int [10];
		int[] arrayD = new int [10];
		//A
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor " + i + " do ArrayA: ");
			arrayA[i] = input.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.printf(arrayA[i]+ " ");
		}
		System.out.print("\n\n");
		
		//B
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor " + i + " do ArrayB: ");
			arrayB[i] = input.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.printf(arrayB[i]+ " ");
		}
		System.out.print("\n\n");
		
		//C
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor " + i + " do ArrayC: ");
			arrayC[i] = input.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.printf(arrayC[i]+ " ");
		}
		System.out.print("\n\n");
		
		//D
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o valor " + i + " do ArrayD: ");
			arrayD[i] = input.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.printf(arrayD[i]+ " ");
		}
		System.out.print("\n\n");
	}
}
