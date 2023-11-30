package fundamentos3;
import java.util.Scanner;

public class exercArray06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] A = new double [5];
		
		for(int i = 0; i < A.length; i++) {
			System.out.printf("Digite o " +(i+1) +" Valor: ");
			A[i] = input.nextDouble();
		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.printf(A[i] + ", ");
		}
	}
}
