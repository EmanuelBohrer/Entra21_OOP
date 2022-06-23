package bohrer.emanuel.oop;

public class Lampada {
	
	double vidaUtil;
	int volt;
	String tipo;
	String marca;
	
	
	
	public static void main(String[] args) {
		
		
		Lampada l1 = new Lampada();
		l1.marca="Taschibra";
		l1.tipo = "Led";
		l1.volt = 12;
		l1.vidaUtil = 25.000;
		
		
		
		
		
		System.out.println("A lâmpada de marca : "+l1.marca);
		System.out.println("Tipo : "+l1.tipo);
		System.out.println("Voltagem : "+l1.volt+ "volt's");
		System.out.println("Vida útil : "+l1.vidaUtil+ "h");
	}

}
