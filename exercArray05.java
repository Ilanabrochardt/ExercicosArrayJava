package fundamentos3;
import java.util.Scanner;

public class exercArray05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] notas = new double [5];
		double soma = 0, media = 0;
		
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota do aluno "+ (i+1) +": ");
			notas[i] = input.nextDouble();
			soma += notas[i];
		}
		
		media = soma / 5;
		
		System.out.printf("\n");
		System.out.printf("A media dos alunos da sala é: " + media);
	}
	
}
