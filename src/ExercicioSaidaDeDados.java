import java.util.Locale;

public class ExercicioSaidaDeDados {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desck";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double prince1 = 2100.0;
		double prince2 = 650.50;
		double prince3 = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s which price is R$%.2f", product1, prince1);
		System.out.println();
		System.out.printf("%s, which price is R$%.2f", product2, prince2);
		System.out.println();
		System.out.println();
		System.out.printf("Record: %s year old, code %s and gender: %s", age, code, gender);
		System.out.println();
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f", prince3);
		System.out.println();
		System.out.printf("Rouded (thess decimal places): %.3f", prince3);
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", prince3);

	}

}
