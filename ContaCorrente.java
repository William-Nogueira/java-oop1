package com.jovemprogramador.construtores;

import java.util.Scanner;

public class ContaCorrente {
	
	private int numeroConta;
	private double saldo;
	private double limite;
	private boolean contaEspecial;
	
	Scanner scan = new Scanner(System.in);
	
	ContaCorrente(int numeroConta){
		this.numeroConta = numeroConta;
		this.saldo = 0;
		this.limite = 2000.0;
		this.contaEspecial = false;
	}
	
	public int getConta(){
		return numeroConta;
	}
	
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double depositar(double deposito) {
		saldo += deposito;
		System.out.println("Deposito de " + deposito + " reais realizado com sucesso!");
		return saldo;
	}
	
	public double depositar(int deposito) {
		saldo += deposito;
		System.out.println("Deposito de " + deposito + " reais realizado com sucesso!");
		return saldo;
	}
	
	public double sacar(double saque) {
		if (saque > saldo) {
			System.out.println("Erro!");
		} else {
			saldo -= saque;
			System.out.println("Saque de " + saque + " reais realizado com sucesso!");
		}
		return saldo;
	}
	
	public double saldo() {
		System.out.println("O saldo e de: " + saldo + " reais.");
		return saldo;
	}
	
	public boolean verificaEspecial() {
		if (contaEspecial) {
			System.out.println("A conta e especial!");
		} else {
			System.out.println("A conta nao e especial!");
		}
		return contaEspecial;
	}
	
}
