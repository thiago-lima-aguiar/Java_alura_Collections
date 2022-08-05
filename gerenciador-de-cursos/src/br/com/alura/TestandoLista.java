package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas); //método toString por trás
		
		aulas.remove(0);

		System.out.println(aulas);
		
	
		for (String aula : aulas) {
			System.out.println("Aula "+ ":"+aula);
		
		}
		
		String primeiraAula=aulas.get(0);
		System.out.println(primeiraAula);
		
		aulas.forEach(aula->{System.out.println("Percorrendo: "+aula);});//igual ao outro for
		
		//Collections serve para ordenar
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//TESTE COMMIT n
		//teste commit no eclipse
		
		//teste
		
	}
}
