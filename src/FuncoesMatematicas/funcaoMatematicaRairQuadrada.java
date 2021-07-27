package FuncoesMatematicas;

public class funcaoMatematicaRairQuadrada {

	public static void main(String[] args) {
		/*
		 * A = Math.sqrt(x); Variável A recebe a raiz quadrada de x
		 * 
		 * A = Math.pow(x, y); Variável A recebe o resultado de x elevado a y
		 * 
		 * A = Math.abs(x); Variável A recebe o valor absoluto de x
		 */

		double x = 3.0;
		double y = 4.0;
		double a, b, c;
		
		a = Math.sqrt(x); //a vatiavel A recebera a raiz quadrada de x(3.0)
		b = Math.sqrt(y); //a vatiavel B recebera a raiz quadrada de y(4.0)
		c = Math.sqrt(25.0); //a vatiavel C recebera a raiz quadrada do numero atribuido a ela
		
		System.out.println("Raiz quadrada de " + x + " = " + a);
		System.out.println("Raiz quadrada de " + y + " = " + b);
		System.out.println("Raiz quadrada de 25 = " + c);
		
	}

}
