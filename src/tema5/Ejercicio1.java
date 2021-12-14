package tema5;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ;
		Scanner in = new Scanner (System.in);
		System.out.print("Ponme una ruta absoluta de el archivo o fichero que quieras comprobar: ");
		path= in.nextLine();
		
		File Doa = new File (path);
		
		if (Doa.exists()) {
			System.out.println("Esa ruta es correcta ");
			if(Doa.isDirectory()) {
				System.out.println("Es un directorio");
				
			}else {
				System.out.println("es un Archivo");
				System.out.println("Nombre del Archivo: "+Doa.getName());
				System.out.print("Permisos:");
				permisos(Doa);
				System.out.println("Peso: "+Doa.length()+" bytes");
				
			}
		}else {
			System.out.println("esa ruta no es correcta ");
		}
		
	}
	public static void permisos(File comp) {
		if(comp.canWrite()) {
			System.out.print(" w");
		}else {
			System.out.print(" -");
		}
		if(comp.canRead()) {
			System.out.print("r");
		}else {
			System.out.print("-");
		}
		if(comp.canExecute()) {
			System.out.println("x ");
		}else {
			System.out.println("- ");
		}
	}
	}

