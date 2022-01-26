package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny { 
	 private Tekstgrensesnitt tekstgr;  
	 private FilmarkivADT filmarkiv;  
	  
	 public Meny(FilmarkivADT filmarkiv){ 
	  tekstgr = new Tekstgrensesnitt();  
	  this.filmarkiv = filmarkiv; 
	 } 
	  
	 public void start(){ 
	             // legg inn en del forhåndsdefinerte filmer 
	  Film film1 = new Film(1, "Johnsen", "Drapet", 2020, Sjanger.ACTION, "Warner");
	  Film film2 = new Film(2, "Hansen", "Gaten", 2010, Sjanger.DRAMA, "Warner");
	  Film film3 = new Film(3, "Paulsen", "Paris", 2015, Sjanger.HISTORY, "Warner");
	  filmarkiv.leggTilFilm(film1);
	  filmarkiv.leggTilFilm(film2);
	  filmarkiv.leggTilFilm(film3);
	  tekstgr.skrivUtFilmProdusent(filmarkiv, "Hansen");
	  tekstgr.skrivUtStatistikk(filmarkiv);
	  tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, "Gaten");
	  filmarkiv.slettFilm(2);
	  tekstgr.skrivUtFilmProdusent(filmarkiv, "Hansen");
	  tekstgr.skrivUtStatistikk(filmarkiv);
	  tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, "Gaten");
	 } 
	 
	} 
