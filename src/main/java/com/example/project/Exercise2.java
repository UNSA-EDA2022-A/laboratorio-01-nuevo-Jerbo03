package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int counter = 0, previo = 0, limite = previo + 50;
		for (int i = 0; i < a.length; i++) {
			if (limite < a[i]) {
				if (previo + 50 < a[i]) return -1;
				limite = previo + 50;
				counter++;
			}
			previo = a[i];
		}
		return counter + 1;
	}
}
