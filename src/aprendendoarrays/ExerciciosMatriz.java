package aprendendoarrays;

import java.util.Scanner;

public class ExerciciosMatriz {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numeros[][] = new int[3][3];
		
		for(int linha = 0 ; linha < numeros.length ; linha++) {
			for (int coluna = 0 ; coluna < numeros.length ; coluna++) {
				System.out.print("Digite um número para a posição [" + linha + "][" + coluna + "]: ");
				numeros[linha][coluna] = read.nextInt();
			}
		}
		
		System.out.println("Elementos da diagonal principal: ");
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.print(numeros[i][i] + " ");
		}
		

		System.out.println("\nElementos da diagonal secundária: ");
		for(int i = 0, x = 2; i < numeros.length; i++, x--) {
			System.out.print(numeros[i][x] + " ");
		}
		
		System.out.print("\nSoma dos Elementos da Diagonal Principal: ");
		int resultado = 0;
		for(int i = 0 ; i < numeros.length ; i++) {
			resultado += numeros[i][i];
		}
		System.out.println(resultado);
		
		System.out.print("Soma dos Elementos da Diagonal Principal: ");
		resultado = 0;
		for(int i = 0, x = 2; i < numeros.length; i++, x--) {
			resultado += numeros[i][x];
		}
		System.out.println(resultado);
		
		
		read.close();
		
	}
}


		

		

