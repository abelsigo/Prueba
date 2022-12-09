package examen;
import java.util.*;

public class examen {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		int hijo []= new int [5];
		int maxhijo = 0;
		int hijos,hijos2,hijos3,hijos4,hijos5;
		double dinero,dinero2,dinero3,dinero4,dinero5;
	
	System.out.println("Introduce los datos de 5 personas: ");
	System.out.print("N hijos del espectador 1: ");
	hijos = teclado.nextInt();
	System.out.print("Dinero en efectivo del espectador 1: ");
	dinero = teclado.nextInt();
	System.out.print("N hijos del espectador 2: ");
	hijos2 = teclado.nextInt();
	System.out.print("Dinero en efectivo del espectador 2: ");
	dinero2 = teclado.nextInt();
	System.out.print("N hijos del espectador 3: ");
	hijos3 = teclado.nextInt();
	System.out.print("Dinero en efectivo del espectador 3: ");
	dinero3 = teclado.nextInt();
	System.out.print("N hijos del espectador 4: ");
	hijos4 = teclado.nextInt();
	System.out.print("Dinero en efectivo del espectador 4: ");
	dinero4 = teclado.nextInt();
	System.out.print("N hijos del espectador 5: ");
	hijos5 = teclado.nextInt();
	System.out.print("Dinero en efectivo del espectador 5: ");
	dinero5 = teclado.nextInt();
	
	int sumahijos = hijos+hijos2+hijos3+hijos4+hijos5;
	int divhijos = sumahijos/5;

	double sumadinero = dinero+dinero2+dinero3+dinero4+dinero5;
	double divdinero = sumadinero/5;

	System.out.println("Media de hijos: "+divhijos);
	System.out.println("Media de dinero: "+divdinero);


	}
}
