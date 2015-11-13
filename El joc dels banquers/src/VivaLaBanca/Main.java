package VivaLaBanca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
	private final static String[] NOM_PERSONES = {"Mario", "Jon", "Anna","Manel", "Pere", "Juan", "Maria", "Juana", "Tania", "Ariadne","Alex","Adria","Ester","Marta","Judit","Juana","David","Carlus","Maryam"};
	private static ArrayList<Banquer> lladres = new ArrayList<Banquer>();
	
	private static final int NOMERO_PERSONES = 15;
	
	public static void main(String[] args) {
		
		Random MrRand = new Random();
		
		for(int i=0; i<NOMERO_PERSONES; i++) {
			Banquer persona = new Banquer (NOM_PERSONES[MrRand.nextInt(NOM_PERSONES.length)]);
			lladres.add(persona);
		}
		do{
			int cara=0;
			int creu=0;
			
			for(Banquer b : lladres){
				b.TiraMoneda();
				if(b.getMoneda()==0) {
					cara++;
				}else{
					creu++;
				}
			}
			Banquer ba;
			if(cara != creu) {
				Iterator<Banquer> temp = lladres.iterator();
				while(temp.hasNext()) {
					ba = temp.next();
					if(ba.getMoneda() == 1) {
						System.out.println("El banquer " + ba.getNom() + " ha perdut");
						temp.remove();
					}
				}
			}else{
				System.out.println("Els banquers han empatat");
			}
		}while(lladres.size() > 2);
		for(Banquer b : lladres) {
			System.out.println("El banquer " + b.getNom() + " ha guanyat");
		}
		

	}
}
