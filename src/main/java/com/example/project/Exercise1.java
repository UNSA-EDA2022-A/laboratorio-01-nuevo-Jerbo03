package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int Estado = 0, k = 0, conversion = 0;
		int numero = a;
		while (Math.pow(10,k) < numero) {
			Estado = comprobarNumero(Estado, a % 10);
			if (Estado == -1) return "El numero proporcionado no esta en base Gabriel.";
			conversion += convertir(a % 10, k);
			a /= 10;
			k++;
		}
		return Integer.toString(conversion);		
	}
	
	public int comprobarNumero(int Estado, int n) {
		switch(Estado) {
			case 0:
				if (n == 0) return 0;
				if (n <= 2) return 1;
				break;
			case 1:
				if (n < 2) return 1;
				break;
		}
		return -1;
	}
	
	public int convertir(int n, int k) {
		return n * ((int) Math.pow(2, k+1) - 1);
	}
	
}
