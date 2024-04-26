package exercicio;

import java.util.Scanner;

public class exercicio07 {

	public void Main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base de um retangulo:");
		float base = sc.nextFloat();

		System.out.println("Digite o valor do retangulo:");
		float altura = sc.nextFloat();

		System.out.println("A area do retangulo:");
		float area = base*altura;
		int area2= (int)area;
		System.out.println("A area do retangulo");




	}
}
