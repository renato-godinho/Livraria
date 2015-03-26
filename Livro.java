package projetoLivraria;


public class Livro {
	
	String nome;
	String descricao;
	String isbn;
	double valor;
	Autor autor = new Autor();
	
	void mostrarDetalhes (){
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Título: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("ISBN: " + isbn);
		System.out.println("Preço: "+ valor);
		System.out.println("Autor: " + autor.nome );
		System.out.println("Email: " + autor.email);
		System.out.println("CPF: " + autor.cpf);
		System.out.println("--------------");
	}
}
