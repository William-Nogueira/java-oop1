package com.jovemprogramador.construtores;

public class Lampada {

	private String modelo;
	private String tensao;
	private String corDaLuz;
	private String tipoDaLampada;
	private double consumoEnergia;
	private boolean lampadaLigada;

	Lampada(String modelo) {
		this.setModelo(modelo);
		this.tensao = "Bivolt";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCorDaLuz() {
		return corDaLuz;
	}

	public String getTipoDaLampada() {
		return tipoDaLampada;
	}

	public String getTensao() {
		return tensao;
	}

	public double getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setCorDaLuz(String corDaLuz) {
		this.corDaLuz = corDaLuz;
	}

	public void setTipoDaLampada(String tipoDaLampada) {
		this.tipoDaLampada = tipoDaLampada;
	}

	public void setConsumoEnergia(double consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	boolean ligarLampada() {
		lampadaLigada = true;
		return lampadaLigada;
	}

	boolean desligarLampada() {
		lampadaLigada = false;
		return lampadaLigada;
	}

	void mostrarEstado() {
		if (lampadaLigada) {
			System.out.println("A lampada esta ligada!");
		} else {
			System.out.println("A lampada esta desligada!");
		}
	}

	void interruptor() {
		if (lampadaLigada) {
			lampadaLigada = false;
			System.out.println("Desligou a lampada! ");
		} else {
			lampadaLigada = true;
			System.out.println("Ligou a lampada! ");
		}
	}
}
