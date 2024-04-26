package exercicio;

import java.util.Scanner;

public class Exerciocio01While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero do tipo inteiro para saber a sua taboada");
		
		int numero = sc.nextInt();
		
		int contador = 1;

		while(contador<11) {
		System.out.println(numero + "X" + contador + "*" + numero*contador);
		contador++;
		}
		sc.close();
	}

}