package OperacaoSplit;

public class OperacaoSplit {

	public static void main(String[] args) {

		/*
		 * Operação split me permite dividir uma String em varias variaveis, atravez do
		 * comando var.split
		 * Dividindo assim a variavel pelo numero do seu vetor.
		 */

		String s = "potato apple lemon";

		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);


	}

}
