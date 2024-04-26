package exercicio;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		int valor1 = scanner.nextInt();

		System.out.println("Digite o segundo valor:");
		int valor2 = scanner.nextInt();

		int resultado = valor1 * valor2;

		System.out.println("A multiplicação dos valores é: " + resultado);

	}
}
