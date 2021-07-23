import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double x = 10.357845556565;
		double x1 = 10.357845556565;
		System.out.printf("%.2f%n", x1);
		System.out.printf("%.3f%n", x);
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		System.out.println("RESULTADO = " + x1 + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x1);

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.err.printf("%s tem %d anos e ganha R$ %.2f Reais %n", nome, idade, renda);
	}

}
