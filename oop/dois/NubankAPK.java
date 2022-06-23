package bohrer.emanuel.oop.dois;

import java.util.Scanner;

public class NubankAPK {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int op;
		
		ContaCorrente conta = new ContaCorrente();
		
		while(true) {
			System.out.println("NUBANK APK 2010 BOMBAPATCH EVO");
			System.out.println("1- Dados da Conta");
			System.out.println("2- Efetuar deposito");
			System.out.println("3- Sacar dinheiro ");
			
			System.out.println("Insira opção : ");
			op = read.nextInt();
			
			
			if(op==1) {
				conta.exibirDados();
			}
			if(op==2) {
				System.out.println("Insira o valor desejado para depositar : ");
				conta.depositarConta(read.nextInt());
			}
			if(op==3) {
				System.out.println("Insira o valor desejado para o saque : ");
				conta.sacarConta(read.nextInt());
				
			}
			
			
			
		}

	}

}
