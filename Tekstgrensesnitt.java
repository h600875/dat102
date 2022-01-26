package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Tekstgrensesnitt { 
	 // lese opplysningene om en FILM fra tastatur  
	 public Film lesFilm(){ 
		 
	  return null;
	 } 
	 
	 
	 // Skrive ut alle Filmer med en spesiell delstreng i tittelen 
	 public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,  
	                                                           String delstreng) { 
		 Film[] tab = filma.soekTittel(delstreng);
		 if(tab.length >= 1) {
			 for(int i = 0; i < tab.length; i++) {
				 System.out.println(tab[i]);
			 }
		 }
		 else {
			 System.out.println("Tittel ikke funnet");
		 }
	 } 
	 
	 // Skriver ut alle Filmer av en produsent / en gruppe 
	 public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) { 
		 Film[] tab = filma.soekProdusent(delstreng);
		 if(tab.length >= 1) {
			 for(int i = 0; i < tab.length; i++) {
				 System.out.println(tab[i]);
			 }
		 }
		 else {
			 System.out.println("Produsent ikke funnet");
		 }
	 } 
	 
	 // Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	 // og hvor mange det er i hver sjanger 
	 public void skrivUtStatistikk(FilmarkivADT filma) { 
		 Sjanger[] sjangertab = Sjanger.values();
		 for(int i = 0; i < sjangertab.length; i++) {
			 System.out.println("Sjanger: " + sjangertab[i] + " = " + filma.antall(sjangertab[i]));
		 }
		 System.out.println("Antall filmer: " + filma.antall());
	 } 
	 // ... Ev. andre metoder 
	 
	} 
