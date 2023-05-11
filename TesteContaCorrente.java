package com.jovemprogramador.construtores;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente joao = new ContaCorrente(12345);
		System.out.println("Numero da conta " + joao.getConta());
		joao.setLimite(500);
		System.out.println("Limite " + joao.getLimite());
		joao.depositar(1000);
		joao.sacar(500);
		joao.saldo();
		joao.verificaEspecial();
	}

}
