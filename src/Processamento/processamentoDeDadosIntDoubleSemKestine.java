package Processamento;

public class processamentoDeDadosIntDoubleSemKestine {

	public static void main(String[] args) {
		
		int a, m;
		double resultado;

		a = 5;
		m = 2;

		resultado = a / m;
		// o resultado sera 2,0 por que o java entende que a divis�o � de numeros
		// inteiros.
		// para que o resultado sai de forma correta (2,5) � necessario fazer um kestine
		// que �:
		// Colocar o tipo (Double) no calculo.

		System.out.println(resultado);
		
	}

}
