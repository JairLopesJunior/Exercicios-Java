package com.exerciciosemjava;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um nome:");
		String nome = scan.next();
		verificarPalindromo(nome);

	}
	
	public static void verificarPalindromo(String nome) {
		 String str = new String(nome);
	     char[] array = str.toCharArray();
	     for(int i = 0; i < array.length; i++) {
	    	 for(int j = array.length-1; j >= 0; j--) {
	    		 if(array[i] != array[j]) {
	    			 System.out.printf("A palavra %s informada não é um palindromo.", str);
	    			 System.exit(0);
	    		 }
	    		 i++;
		     }
	     }
	     System.out.printf("A palavra %s é um palindromo.", str);
	}
}
