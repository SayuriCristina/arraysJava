package aprendendoarrays;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numeros[] = new int[10];
		float soma = 0f;
		
		
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.printf("Digite o %do número do vetor (posição [%d]): ", i+1, i);
			numeros[i] = read.nextInt();
		}
		
		
		System.out.print("Elementos nos índices ímpares: ");
		for(int i = 0 ; i < numeros.length ; i++) {
			if(i % 2 != 0) {
				System.out.println(numeros[i]);
			}
			soma += numeros[i];
		}

		
		System.out.print("Elementos nos índices pares: ");
		for(int i = 0 ; i < numeros.length ; i++) {
			if (i % 2 == 0){
				System.out.println(numeros[i]);
			}
			
		}
		
		float media = soma / 10;
		System.out.printf("Soma: %.0f\n", soma);
		System.out.printf("Média: %.2f\n", media);
		
		read.close();
	}

}
