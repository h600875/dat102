package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{
	private Film[] tab;
	private int antallFilmer;
	
	public Filmarkiv(int antall) {
		tab = new Film[antall];
		antallFilmer = 0;
	}
	
	 public void visFilm(int nr) {
		 for(int i = 0; i < antallFilmer; i++) {
			 if(tab[i].getFilmnr() == nr) {
				 System.out.println(tab[i].toString());
			 }
		 }
	 } 
	 
	 
	 public void leggTilFilm(Film nyFilm) {
		 if((antallFilmer == tab.length) && antallFilmer != 0) {
			 utvid();
		 }
		 tab[antallFilmer] = nyFilm;
		 antallFilmer++;
	 } 
	 

	 public boolean slettFilm(int filmnr) {
		 boolean sjekk = false;
		 for(int i = 0; i < tab.length && !sjekk; i++) {
			 if(tab[i].getFilmnr() == filmnr) {
				 tab[i] = tab[antallFilmer - 1];
				 tab[antallFilmer - 1] = null;
				 antallFilmer--;
				 sjekk = true;
			 }
		 }
		 return sjekk;
	 }
	 

	 public Film[] soekTittel(String delstreng) {
		Film[] temp = new Film[antallFilmer];
		int tempAntall = 0;
		for(int i = 0; i < temp.length; i++) {
			if(tab[i].getTittel() == delstreng) {
				temp[tempAntall] = tab[i];
				tempAntall++;
			}
		}
		return trimTab(temp, tempAntall);
		 
	 }
	 public Film[] soekProdusent(String produsent) {
		 Film[] temp = new Film[antallFilmer];
			int tempAntall = 0;
			for(int i = 0; i < temp.length; i++) {
				if(tab[i].getProdusent() == produsent) {
					temp[tempAntall] = tab[i];
					tempAntall++;
				}
			}
			return trimTab(temp, tempAntall);
	 }
	 

	 public int antall(Sjanger sjanger) {
		 int tempAntall = 0;
		 for(int i = 0; i < antallFilmer; i++) {
			 if(tab[i].getSjanger() == sjanger) {
				 tempAntall++;
			 }
		 }
		return tempAntall;
		 
	 }
	 

	 public int antall() {
		return antallFilmer;
	 }
	
	
	private void utvid() {
		Film[] hjelpetab = new Film[tab.length * 2];
		
		for(int i = 0; i < tab.length; i++) {
			hjelpetab[i] = tab[i];
		}
		tab = hjelpetab;
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
