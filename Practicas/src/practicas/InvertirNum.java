package practicas;

import java.util.Scanner;

public class InvertirNum {

	public static void main(String[] args) {

		int numUser;
		int aux=0;
		int inverso=0;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		numUser = lee.nextInt();
		
		/*Aqui estoy intentando darle la vuelta a un numero*/
		/*Entonces dijimos que primero tomamos la primera cifra, y eso lo hacemos con modulo 10*/
		
		while (numUser != 0) {
			aux = numUser%10;
			inverso = inverso*10 + aux;
			numUser = numUser/10;
		  
		}
		if (((int)aux == (int)numUser)) {
			System.out.println("El numero introducido es capicua");
		}
	
		System.out.println(inverso);
		
		lee.close();
	}

}
