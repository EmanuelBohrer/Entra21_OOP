package bohrer.emanuel.oop.dois;

import java.util.Scanner;

public class Teste_Lamp {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int op;
		
		Lampada lampada = new Lampada();
		
		while(true) {
			System.out.println("Menu Lamp");
			System.out.println("1- Dados da Lâmpada");
			System.out.println("2 - Estado atual da lâmpada");
			System.out.println("3 - Alternar estados");
			System.out.println("4 - Desligar sistema!");
			
			System.out.println("Insire sua opção : ");
			op = read.nextInt();
			
			
			
			if(op==1) {
				
				lampada.exibirDados();
			}
			if(op==2) {
				lampada.estadoLamp1();
			}
			if(op==3) {
				System.out.println("Digite 1 para ligar a lâmpada e 0 para desligar : ");
				
				lampada.ativarLampada(read.nextInt());
				
			}
			if(op==4) {
				System.out.println("Sistema desligando!");
				break;
			}
			
		}

		

	}

}
