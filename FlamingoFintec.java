package projeto;

import java.util.Scanner;

public class FlamingoFintec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mumeroDaConta;
		float saldo;
		
		System.out.println("Flamingo Fintec");
		System.out.println();
		System.out.println("Seja bem vindo a FLamingo Fintec");
		System.out.println();
		System.out.println();
		System.out.println("Para acessar a FLamingo Fintc, insira seu usuário");
		System.out.println("Digite seu usuário");
		String usuario = sc.next();
		System.out.println("Digite sua senha");
		String senha = sc.next();
		
		if (usuario.equals("gabriel")&&(senha.equals("ga123"))){
			System.out.println("Sistema logado com sucesso");
			System.out.println("Seja bem vindo"+" "+"usuario");
			System.out.println();
			System.out.println();
			System.out.println("Flamingo Fintec");
			System.out.println();
			System.out.println("1 - Saldo");
			System.out.println();
			System.out.println(" 2- Extrato");
			System.out.println();
			System.out.println("3- Deposito");
			System.out.println();
			System.out.println("4-Transferência");
			System.out.println();
			System.out.println("5- Pagamento");
			System.out.println();
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
			System.out.println("Você escolheu a opção 1- Saldo");
			System.out.println("Digite o numero de sua conta");
			System.out.println();
			System.out.println();
			mumeroDaConta = sc.nextInt();
			
			
			}
			
			
			
			
			
			
		}
		
		sc.close();

	}

}
