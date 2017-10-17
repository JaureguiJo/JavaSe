package com.prueba;
import java.util.Arrays;

public class CuentaPalabras {
	
	String[] meses = {"january", "february", "march", "april", "may", "june", "july", 
			"august", "september", "october", "november", "december"};
	
	int numeroDeLetras;
	
	public CuentaPalabras(){
		
	}
	
	public CuentaPalabras(int numero){
		this.numeroDeLetras = numero;
	}
	
	public void cuentaLetras(){
		for(int i = 0; i < meses.length; i++){
			if(meses[i].length() == numeroDeLetras){
				System.out.println(meses[i]+" : "+numeroDeLetras);
				i=meses.length;
			}
		}
		System.out.println();
		for(int i = 0; i < meses.length; i++){
			if(meses[i].length() == numeroDeLetras){
				System.out.println(meses[i]+" : "+numeroDeLetras);
			}
		}
		
		
	}
	
	public void Ordenar(){
		Arrays.sort(meses);
		for(String i: meses){
			System.out.println(i);
		}
		
	}



}
