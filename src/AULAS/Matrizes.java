package AULAS;

import java.util.Scanner;

public class Matrizes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas e colunas:");
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n];
		System .out.println("Digite os valores da matriz:");
		for (int l  = 0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("matriz:");
		for (int l = 0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("====");
		System.out.println("Diagonal principal:");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("====");
		
		int count = 0;
		for (int l = 0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				if (mat[l][c] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Números negativos = " + count);
		sc.close();
	}
}
