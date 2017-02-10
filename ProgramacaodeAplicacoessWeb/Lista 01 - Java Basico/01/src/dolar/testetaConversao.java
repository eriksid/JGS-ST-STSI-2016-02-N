package dolar;

import java.util.Scanner;

public class testetaConversao {

	public static void main(String[] args) {
		
		Dolar n1 = new Dolar();
		 Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor em dolar:");
		n1.converterEmReais(teclado.nextLine());
        System.out.println("O valor em reis é: " + n1.getValorReais());
        

	}

}
