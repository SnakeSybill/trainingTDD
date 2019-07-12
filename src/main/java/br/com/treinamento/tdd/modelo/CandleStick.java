package br.com.treinamento.tdd.modelo;

import java.time.LocalDateTime;

public final class CandleStick {

	private final double abertura;
	private final double fechamento;
	private final double maximo;
	private final double minimo;
	private final double volume;
	private final LocalDateTime data;
	
	public CandleStick(double abertura, double fechamento, double maximo, double minimo, double volume,
			LocalDateTime data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.maximo = maximo;
		this.minimo = minimo;
		this.volume = volume;
		this.data = data;
	}
	public double getAbertura() {
		return abertura;
	}
	public double getFechamento() {
		return fechamento;
	}
	public double getMaximo() {
		return maximo;
	}
	public double getMinimo() {
		return minimo;
	}
	public double getVolume() {
		return volume;
	}
	public LocalDateTime getData() {
		return data;
	}
	
	public boolean isAlta() {
		return this.abertura < this.fechamento;
	}
	
	public boolean isBaixa() {
		return this.abertura > this.fechamento;
	}
}