package AULAS;

import java.util.Scanner;

public class ReceberVetores {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] valor = new int[10];
		for (int i = 0; i < valor.length; i++)
		{
			System.out.println("Digite o " + (i + 1) + "ºvalor");
			valor[i] = leia.nextInt();
		}
		System.out.println("Valores recebidos");
		for (int i = 0; i < valor.length; i++) 
		{
			System.out.print(valor[i] + " ");
		}
		leia.close();
	}
}
