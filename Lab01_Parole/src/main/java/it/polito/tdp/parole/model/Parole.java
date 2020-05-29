package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	private List<String>listaParole;
		
	public Parole() {
		listaParole=new LinkedList<>();
	}
	
	public void addParola(String p) {
		listaParole.add(p);
		return;
	}
	
	public List<String> getElenco() {
	Collections.sort(listaParole);
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
		return;
	}
	public void cancella(String p) {
		listaParole.remove(p);
		return;
	}

}
