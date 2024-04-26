package exercicio;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        if (valor2 == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            double resultado = valor1 / valor2;
            System.out.println("A divisão dos valores é: " + resultado);
        }

	}
}
