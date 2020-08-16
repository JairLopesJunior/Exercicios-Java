package com.exerciciosemjava;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int num = scan.nextInt();
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.printf("O numero %d não é primo", num);
				System.exit(0);
			}
		}
		System.out.printf("O numero %d é primo", num);
	}
}
