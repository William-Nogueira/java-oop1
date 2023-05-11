package com.jovemprogramador.construtores;

public class TesteLampada {

	public static void main(String[] args) {
	
		Lampada lampada = new Lampada("A60");
		lampada.setCorDaLuz("Amarela");
		lampada.setTipoDaLampada("Abajur");
		lampada.setConsumoEnergia(20.5);
		
		System.out.println(lampada.getModelo());
		System.out.println(lampada.getTensao());
		System.out.println(lampada.getConsumoEnergia());
		System.out.println(lampada.getCorDaLuz());
		System.out.println(lampada.getTipoDaLampada());
		
		lampada.ligarLampada();
		lampada.mostrarEstado();
		lampada.desligarLampada();
		lampada.mostrarEstado();
		lampada.interruptor();
		lampada.mostrarEstado();
	}

}
