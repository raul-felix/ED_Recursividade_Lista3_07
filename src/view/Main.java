package view;

import controller.SomaController;

public class Main {
	
	public static void main(String[] args) {
		
		SomaController somaController = new SomaController();
		int n = 123;
		int resultado = somaController.somaDigitos(n);
		System.out.println(resultado);
	}
}
