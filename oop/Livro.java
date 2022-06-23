package bohrer.emanuel.oop;

public class Livro {
	
	String titulo;
	String editora;
	int edicao;
	String publica;
	String autor;
	String tema;
	
public static void main(String[] args) {
	
		Livro Livro1 = new Livro();
		Livro1.autor="George Orwell";
		Livro1.editora="Intriseca";
		Livro1.edicao=15;
		Livro1.publica="2015";
		Livro1.titulo = "A revolução dos bichos";
		Livro1.tema = "Industrial";
		
		
		System.out.println("Livro : "+Livro1.titulo);
		System.out.println("Autor : "+Livro1.autor);
		System.out.println("Editora : "+Livro1.editora);
		System.out.println("Edição atual : "+Livro1.edicao);
		System.out.println("Ano de publicação : "+Livro1.publica);
		
		

	}
}

