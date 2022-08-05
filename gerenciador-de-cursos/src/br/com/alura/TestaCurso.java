package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		

        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        System.out.println(aulas);  
	}

}
