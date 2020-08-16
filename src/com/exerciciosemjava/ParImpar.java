package com.exerciciosemjava;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O numero %d é par", num);
		}else {
			System.out.printf("O numero %d é impar", num);
		}
	}
}
