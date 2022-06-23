package bohrer.emanuel.oop;

public class LivroDeBiblioteca {
	
	String titulo;
	String editora;
	int edicao;
	String publica;
	String autor;
	String tema;
	int codigo;
	
	public static void main(String[] args) {
		
		LivroDeBiblioteca Livro3 = new LivroDeBiblioteca();
		Livro3.autor="George Orwell";
		Livro3.editora="Intriseca";
		Livro3.edicao=15;
		Livro3.publica="2015";
		Livro3.titulo = "A revolução dos bichos";
		Livro3.tema = "Industrial";
		Livro3.codigo=3333;
	}

}
