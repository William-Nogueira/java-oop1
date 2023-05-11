package com.jovemprogramador.construtores;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o nome do aluno? ");
		String nomeAluno = scan.nextLine();
		System.out.println("Qual o numero da matricula? ");
		int matriculaAluno = scan.nextInt();
		System.out.println("Qual o curso do aluno? ");
		String cursoAluno = scan.next();
		
		Aluno novoAluno = new Aluno(matriculaAluno, nomeAluno, cursoAluno);
		
		System.out.println("Numero da matricula: " + novoAluno.getNumeroMatricula());
		System.out.println("Curso: " + novoAluno.getCurso());
		
		System.out.println("Disciplinas: ");
		for (int i = 0; i < novoAluno.getDisciplinas().length; i++) {
			System.out.println(novoAluno.getDisciplinas()[i]); 
		}
		
		System.out.println("Qual a nota em " + novoAluno.getDisciplinas()[0] + "?");
		novoAluno.setNotaPortugues(scan.nextInt());
		
		System.out.println("Qual a nota em " + novoAluno.getDisciplinas()[1] + "?");
		novoAluno.setNotaMatematica(scan.nextInt());
		
		System.out.println("Qual a nota em " + novoAluno.getDisciplinas()[2] + "?");
		novoAluno.setNotaHistoria(scan.nextInt());
		
		novoAluno.Aprovado();
		scan.close();
		
	}
}
