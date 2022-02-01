package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT{ 
    private int antall; 
    private LinearNode<Film> start; 
    // Ingen referanse til siste, kun start 
	@Override
	public void visFilm(int nr) {
		LinearNode<Film> denne = start;
		while(denne != null) {
			if(denne.getElement().getFilmnr() == nr) {
				System.out.println(denne.getElement().toString());
			}
			denne = denne.getNeste();
		}
	}
	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> denne = start;
		LinearNode<Film> film = new LinearNode<>(nyFilm);
		while(denne != null) {
			denne = denne.getNeste();
			}
			film.setNeste(denne);
			denne = film;
			antall++;
		}
	@Override
	public boolean slettFilm(int filmnr) {
		LinearNode<Film> denne = start;
		while(denne != null) {
			if(denne.getElement().getFilmnr() == filmnr) {
				denne = null;
				antall--;
				return true;
			}
			denne = denne.getNeste();
		}
		return false;
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] tab = new Film[antall];
		LinearNode<Film> denne = start;
		int tempAntall = 0;
		while(denne != null) {
			if(denne.getElement().getTittel() == delstreng) {
				tab[tempAntall] = denne.getElement();
				tempAntall++;
			}
			denne = denne.getNeste();
		}
		return trimTab(tab, tempAntall);
	}
	@Override
	public Film[] soekProdusent(String produsent) {
		Film[] tab = new Film[antall];
		LinearNode<Film> denne = start;
		int tempAntall = 0;
		while(denne != null){
			if(denne.getElement().getProdusent() == produsent) {
				tab[tempAntall] = denne.getElement();
				tempAntall++;
				denne = denne.getNeste();
			}
			else {
				denne = denne.getNeste();
				System.out.println(denne.getElement().toString());
			}
		}
		return trimTab(tab, tempAntall);
	}
	@Override
	public int antall(Sjanger sjanger) {
		int tempAntall = 0;
		LinearNode<Film> denne = start;
		while(denne != null) {
			if(denne.getElement().getSjanger() == sjanger) {
				tempAntall++;
			}
			denne = denne.getNeste();
		}
		return tempAntall;
	}
	@Override
	public int antall() {
		return antall;
	}
	
	
	private Film[] trimTab(Film[] tab, int n) { 
		  Film[] nytab = new Film[n]; 
		  int i = 0; 
		  while (i < n) { 
		   nytab[i] = tab[i]; 
		   i++; 
		  } 
		  return nytab; 
		 } 
	
} 
