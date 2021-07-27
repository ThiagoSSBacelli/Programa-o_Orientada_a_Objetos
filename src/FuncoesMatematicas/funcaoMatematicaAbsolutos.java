package FuncoesMatematicas;

public class funcaoMatematicaAbsolutos {

	public static void main(String[] args) {

		/*
		 * A = Math.sqrt(x); Variável A recebe a raiz quadrada de x
		 * 
		 * A = Math.pow(x, y); Variável A recebe o resultado de x elevado a y
		 * 
		 * A = Math.abs(x); Variável A recebe o valor absoluto de x
		 */

		double x = 3.0;
		double y = 	4.0;
		double z = -5.0;
		double a, b, c;
		
		a = Math.abs(y);
		b = Math.abs(z);
		
		System.out.println("O valor Absoluto de " + y + " é " + a);
		System.out.println("O valor Absoluto de " + z + " é " + b);
		
	}

}
