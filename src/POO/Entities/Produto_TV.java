package Entities;

public class Produto_TV {
	//Minha Classe Produto_TV é tambem um Object

	public String name; // nome
	public double price; // Preço
	public int quantity; // quantidade

	public double totalValueInStock() {
		// valor total em estoque, devera trazer o valor atual em estoque, sendo
		// calculada o preço x quantidade

		return price * quantity;
	}

	public void addProducts(int addQuantiy) {
		this.quantity += addQuantiy;
		// THIS.quantitiy quer dizer que estou me referindo ao ATRIBUTO QUANTITY (public
		// int quantity) E o += quer dizer que estou somando a quantidade
		// atribuida ao ARGUMENTO QUANTITY (addProducts(int addQuantiy)) ao meu ATRIBUTO
		// QUANTITY.
		// public void addProducts(int quantiy) = Argumento
		// public int quantity = Atributo
	}

	public void removeProducts(int removeQuantity) {
		this.quantity -= removeQuantity;
		// THIS.quantitiy quer dizer que estou me referindo ao ATRIBUTO QUANTITY (public
		// int quantity) E o -= quer dizer que estou subtraindo a quantidade
		// atribuida ao ARGUMENTO QUANTITY (removeProducts(int removeQuantity)) ao meu ATRIBUTO
		// QUANTITY.
		// public void addProducts(int quantiy) = Argumento
		// public int quantity = Atributo
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
	}
}

