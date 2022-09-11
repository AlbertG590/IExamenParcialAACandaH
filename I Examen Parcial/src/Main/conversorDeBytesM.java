package Main;

import java.util.Scanner;

public class conversorDeBytesM {

	public conversorDeBytesM() {
		
	}

	public static void main(String[] args) {
		
		int opciones;
		
		conversorDeBytes k = new conversorDeBytes();
		
		Scanner menu = new Scanner(System.in);
		
		System.out.println("Bienvenido al conversor de Bytes");
		System.out.println("Por favor seleccione una opcion ");
		System.out.println("1.Convertir B en KB ");
		System.out.println("2.Convertir KB en MB ");
		System.out.println("3.Salir ");
		
		opciones = menu.nextInt();
		
		switch(opciones) {
		case 1:
			k.kilobytes();
			break;
		case 2:
			k.megabytes();
			break;
		case 3:
			System.exit(0);
			default:
				System.out.println("opcion invalida");
		}
		
	}

}