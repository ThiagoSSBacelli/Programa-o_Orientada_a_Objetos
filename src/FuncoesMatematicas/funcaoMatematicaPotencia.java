package FuncoesMatematicas;

public class funcaoMatematicaPotencia {

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
		double z = -5.0;
		double a, b, c;
		
		a = Math.pow(x, y); //a vatiavel A recebera a potencia de X elevado a Y
		b = Math.pow(x, 2.0); //a vatiavel B recebera a potencia de X elevado a 2.0 
		c = Math.pow(5.0, 2.0); //a vatiavel C recebera a potencia de 5.0 elevado a 2.0
		
		System.out.println(x + " Elevado a " + y + "é igual a: " + a);	
		System.out.println(x + " Elevado a  2.0 (quadrado) é igual a: " + b);	
		System.out.println("5.0 elevado a 2.0 (quadrado) é: " + c); 	
		
		
	}

}
