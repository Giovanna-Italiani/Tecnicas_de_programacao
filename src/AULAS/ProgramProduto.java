package AULAS;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de itens");
		int n = sc.nextInt();
		Produto[] produtos = new Produto[n];
		for (int i = 0; i < produtos.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto");
			String nome = sc.nextLine();
			System.out.println("Digite o preço do produto");
			double preco = sc.nextDouble();
			produtos[i] = new Produto(nome, preco);
		}
		double soma = 0.0;
		for (int i = 0; i < produtos.length; i++) {
			soma += produtos[i].getPreco();
		}
		System.out.println("Produtos cadastrados");
		for (int i = 0; i < produtos.length; i ++) {
			System.out.printf("Nome: %s,Preço: %.2f%n", produtos[i].getNome(), produtos[i].getPreco());
		}
		double media = soma / produtos.length;
		System.out.printf("Preço Médio = %.2fn", media);
		sc.close();
	}
}
