package ej2;

import java.util.Scanner;

public class ej2 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		int primos []= new int [num];
		
		for(int i = 1;i<num;i++) {
			int div = i%1;
			if(div == 0) {
				primos[i] = i;
			}
		}
		
		
		System.out.println("Numeros primos entre 1 y "+num +": ");
		for(int i = 0;i<num;i++) {
			System.out.println(primos[i]);
		}
	}
}
