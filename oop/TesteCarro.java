package bohrer.emanuel.oop;

public class TesteCarro {
	

	

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		
		System.out.println("O carro de modelo : "+van.marca);
		System.out.println("De marca : "+van.modelo);
		System.out.println("Tem como capacidade de passageiros : "+van.numPassageiros);
		System.out.println("Total de combustivel : "+van.capCombustivel);
		System.out.println("Com consumo de : "+van.consumoCombustivel);
		
		
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		
		
		System.out.println("========================================");

		System.out.println("O carro de modelo : "+fusca.marca);
		System.out.println("De marca : "+fusca.modelo);
		System.out.println("Tem como capacidade de passageiros : "+fusca.numPassageiros);
		System.out.println("Total de combustivel : "+fusca.capCombustivel);
		System.out.println("Com consumo de : "+fusca.consumoCombustivel);
		
		System.out.println("========================================");

		
		Carro c1 = new Carro();
		c1.marca= "Fiat";
		c1.modelo="Ducato";
		Carro c2 = new Carro();
		c2.marca= "Fiat";
		c2.modelo="Ducato";
		
		if(c1.equals(c2)) {
			System.out.println("Carros iguais.");
		}
		
		System.out.println("Modelo : "+c1.modelo);
		System.out.println();
		System.out.println("Modelo : "+c2.modelo);
		
	}

}
