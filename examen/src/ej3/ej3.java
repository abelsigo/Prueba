package ej3;

import java.util.Scanner;

public class ej3 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		/*
		int menor;
		int mayor;
		int calculo= 1;
		
		System.out.print("Introduce el numero menor: ");
		menor = teclado.nextInt();
		System.out.print("Introduce el numero mayor: ");
		mayor = teclado.nextInt();
	
		for(int i = menor;i<=mayor;i++) {
			calculo = calculo * i;	
			System.out.println("!"+i+" "+calculo);
		}
			*/
		int hijo []= new int [5];
		System.out.println("Introduce los datos de 5 personas: ");
		for(int i = 0; i<5;i++) {
			System.out.print("N hijos del espectador "+i+": ");
			hijo[i] = teclado.nextInt();
		}
}
}
