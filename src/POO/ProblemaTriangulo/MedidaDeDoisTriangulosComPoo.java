package ProblemaTriangulo;

import java.util.Locale;
import java.util.Scanner;

import Application.FuncaoTrianglePOO;

public class MedidaDeDoisTriangulosComPoo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		FuncaoTrianglePOO x, y;
		// Veja que a Classe FuncaoTrianglePOO foi importada e por esse motivo nao
		// precisamos de todos aqueles atributos, assim como vimos no mesmo exercicio
		// porem sem o POO

		x = new FuncaoTrianglePOO(); //instaciando a classe
		y = new FuncaoTrianglePOO(); //instaciando a classe

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
