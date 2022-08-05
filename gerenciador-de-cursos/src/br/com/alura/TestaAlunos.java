package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	
	public static void main(String[] args) {
		
		//o set não possue garantia em relação a ordem
		//Set é um conjunto de elementos
		//assim , o set não possue get()
		//o set não permite elementos duplicados
		Set <String> alunos=new HashSet<String>();
	
		
		alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        System.out.println(alunos);
        
        boolean thiagoMatriculado=alunos.contains("Renan Saggio");
        
        System.out.println(thiagoMatriculado);
        
        alunos.remove("Renan Saggio");
        
        System.out.println(alunos);
        
//        for(String aluno:alunos) {
//        	
//        	System.out.println("Aluno: "+aluno);
//        
//        	
//        }
//        
//        alunos.forEach(a->{
//        	System.out.println(a);
//        });
        
        		
		
	}

}
