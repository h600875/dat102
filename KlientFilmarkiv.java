package no.hvl.data102.klient;

import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.FilmarkivADT;

public class KlientFilmarkiv { 
	 
	 public static void main(String[] args) { 
	  FilmarkivADT filma = new Filmarkiv(50);  
	  Meny meny = new Meny(filma);
	  meny.start(); 
	 } 
	 
	} 
