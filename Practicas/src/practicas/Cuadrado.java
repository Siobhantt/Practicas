package practicas;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		int numero=4;
		
		/*Parte de superior*/
		for (int i = 1; i<=numero;i++) {
			System.out.print("*");
		}
		System.out.println();
		//centro de la forma
		for (int i=1;i<=numero-2;i++) {
			System.out.print("*");
			for(int j =1; j<=numero-2;j++) {
				System.out.print(" ");
			}
		System.out.println("*");
		}
	
		/*Parte inferior*/
		for (int i =1; i<=numero; i++) {
			System.out.print("*");
		}
	
	}

}
