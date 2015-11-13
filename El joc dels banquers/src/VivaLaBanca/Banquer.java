package VivaLaBanca;

import java.util.Random;

public class Banquer {

	private String nom;
	private Random r;
	private int moneda;
	
	public Banquer(String Nom) {
		this.nom=Nom;
		r = new Random();
	}
	
	public String getNom() {
		return nom;
	}
	public void TiraMoneda() {
		moneda = r.nextInt(2);
	}
	public int getMoneda() {
		return moneda;
	}
}
