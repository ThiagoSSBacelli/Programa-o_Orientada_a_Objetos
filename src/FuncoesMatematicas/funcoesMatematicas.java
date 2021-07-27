package FuncoesMatematicas;

public class funcoesMatematicas {

	public static void main(String[] args) {


		double a = 3.0;
		double b = 	4.0;
		double c = -5.0;
		double delta;
		double x1;
		double x2;
				
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.pow(delta, 0)) / (2.0 * a); 
		x2 = (-b - Math.pow(delta, 0)) / (2.0 * a); 
		
		System.out.println(delta);
		System.out.println(x1);
		System.out.println(x2);
		
	}

}
