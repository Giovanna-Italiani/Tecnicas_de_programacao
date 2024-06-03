package AULAS;

public class ForEach {
	
	public static void main(String[] args) {
		String[] nomes = new String[] {"Maria", "Bob", "Alex", "Pedro", "Ana", "Joaquim"};
		
		for (int i=0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("====");
		
		for (String obj : nomes) {
			System.out.println(obj);
		}
		
	}
}
