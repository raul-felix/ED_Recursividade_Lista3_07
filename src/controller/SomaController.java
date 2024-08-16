package controller;

public class SomaController {
	
	public SomaController() {
		super();
	}
	
	public int somaDigitos(int n) {
		// se n for menor que 10, retornamos n, o dígito que sobrou 
		if (n < 10) {
			return n;
		} else {
			// se não, encontramos o valor do dígito e o somamos com o retorno da função passada com o parâmetro de um dígito a menos
			int digito = n % 10;
			return digito + somaDigitos(n / 10);
		}
	}
}
