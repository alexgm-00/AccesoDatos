package tema5;

import java.io.File;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ;
		Scanner in = new Scanner (System.in);
		System.out.print("Ponme una ruta absoluta de el archivo o fichero que quieras borrar: ");
		path= in.nextLine();
		
		File Doa = new File (path);
		
		if (Doa.exists()) {
			System.out.println("Esa ruta es correcta ");
			if(Doa.isDirectory()) {
				System.out.println("Es un directorio esto no se puede eliminar");
				
			}else {
				System.out.println("es un Archivo");
				System.out.println("Nombre del Archivo: "+Doa.getName());
				if(Doa.delete()) {
					System.out.println("Se ha Eliminado con exito");
				}
					} 
		}else {
				System.out.println("Esa ruta no es correcta");
		}
	
	}
}