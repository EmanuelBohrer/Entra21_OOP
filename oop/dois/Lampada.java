package bohrer.emanuel.oop.dois;

public class Lampada {
	
	double vidaUtil=25.000;
	int volt=12;
	String tipo="Led";
	String marca ="Taschibra";
	boolean estado;
	
	
	
	
	void estadoLamp1() {
		if(estado == false) {
			System.out.println("L�mpada desligada!");
		}else if(estado== true) {
			System.out.println("L�mpada ligada!");

		}
		
	}
	

	

	void exibirDados() {
		System.out.println("A l�mpada de marca : "+marca);
		System.out.println("Tipo : "+tipo);
		System.out.println("Voltagem : "+volt+ "volt's");
		System.out.println("Vida �til : "+vidaUtil+ "h");
	}
	
	
	
	
	void ativarLampada(int atv) {
		if(atv==1) {
			estado = true;
		}else if(atv==0) {
			estado = false;
		}
		
	}
	
}

