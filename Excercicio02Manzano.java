package exercicio;

public class Excercicio02Manzano {

	public static void main(String[] args) {

		int resultado = 0;
		int valorantigo = 0;

		for (int i = 2; i <= 500; i += 2) {

			valorantigo = resultado;
			resultado = resultado + i;
			System.out.println("A soma de " + valorantigo + " + " + i + " é: " + resultado);
			valorantigo = resultado;

		}

		System.out.println("A soma de todos os numeros pares é: " + resultado);
	}
}