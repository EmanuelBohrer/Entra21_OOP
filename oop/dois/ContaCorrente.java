package bohrer.emanuel.oop.dois;

public class ContaCorrente {
	
	int numeroConta=1;
	double saldo=15;
	String status="Especial";
	int limite=200;
	double deposito=0;
	double rest=0;
	
	
	
	
	
	void exibirDados() {
		System.out.println("DADOS DA CONTA");
		System.out.println("Número da Conta : "+numeroConta);
		System.out.println("Saldo na Conta : "+saldo);
		System.out.println("Status : "+status);
		System.out.println("Dinheiro no deposito : "+deposito);
	}
	
	
	void depositarConta(double valor) {
		if(saldo<valor) {
			System.out.println("Saldo insufiente para o deposito!");
		}else if(saldo>0) {
			saldo-=valor;
			
			deposito+=valor;
			System.out.println("Transação efetuada!");
		}
	}
	
	
	void sacarConta(double valor) {
		if(deposito<valor) {
			System.out.println("Saldo insuficiente na conta!");
		}else if(deposito>0) {
			deposito-=valor;
			
			saldo+=valor;
			System.out.println("Transação efetuada!");
		}
	}
	
	
	
	
}
