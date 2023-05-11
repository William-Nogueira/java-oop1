package com.jovemprogramador.construtores;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private int notaPortugues;
	private int notaMatematica;
	private int notaHistoria;

	Aluno(int numeroMatricula, String nome, String curso) {
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.curso = curso;
		this.getDisciplinas()[0] = "Portugues";
		this.getDisciplinas()[1] = "Matematica";
		this.getDisciplinas()[2] = "Historia";
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setNotaPortugues(int notaPortugues) {
		this.notaPortugues = notaPortugues;
	}

	public void setNotaMatematica(int notaMatematica) {
		this.notaMatematica = notaMatematica;
	}

	public void setNotaHistoria(int notaHistoria) {
		this.notaHistoria = notaHistoria;
	}

	public boolean Aprovado() {
		if (notaPortugues < 7) {
			System.out.println("O aluno " + nome + " nao foi aprovado em " + getDisciplinas()[0] + ".");
		} else {
			System.out.println("O aluno " + nome + " foi aprovado em " + getDisciplinas()[0] + "!");
		}

		if (notaMatematica < 7) {
			System.out.println("O aluno " + nome + " nao foi aprovado em " + getDisciplinas()[1] + ".");
		} else {
			System.out.println("O aluno " + nome + " foi aprovado em " + getDisciplinas()[1] + "!");
		}

		if (notaHistoria < 7) {
			System.out.println("O aluno " + nome + " nao foi aprovado em " + getDisciplinas()[2] + ".");
		} else {
			System.out.println("O aluno " + nome + " foi aprovado em " + getDisciplinas()[2] + "!");
		}

		if (notaHistoria >= 7 && notaMatematica >= 7 && notaPortugues >= 7) {
			System.out.println("O aluno " + nome + " passou de ano!");
			return true;
		} else {
			System.out.println("O aluno " + nome + " nao passou de ano.");
			return false;
		}

	}

}
