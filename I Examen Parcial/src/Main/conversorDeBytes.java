package Main;

import java.util.Scanner;

public class conversorDeBytes {

	Scanner menu = new Scanner(System.in);
	
	int b,kB,mB;
	
	public void kilobytes() {
		
		System.out.println("Ingrese los Bytes a convertir");
		kB = b / 1024;
		b = b % 1024;
		System.out.println(kB+"Bytes equivalen a "+b+"KiloBytes");		
	}

	public void megabytes() {
		mB = kB / 1024;
		kB = kB % 1024;	
		System.out.println(mB+"KiloBytes bequivalen a "+kB+"MegaBytes");
		
	}
	
}
