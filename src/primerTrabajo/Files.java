package primerTrabajo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				String p1,p2;
				Scanner in = new Scanner (System.in);
				System.out.println("Dime el nombre que le quieres poner al fichero sin el .txt");
				p1 = in.nextLine();
				System.out.println("Y ahora la ruta absoluta del directorio donde lo quieres guardar :");
				p2 = in.nextLine();
				File Directorio = new File(p2);
				if (!Directorio.exists()) {
		            if (Directorio.mkdirs()) {
		                System.out.println("Directorio creado");
		            } else {
		                System.out.println("Error al crear directorio");
		            }
				}
				
				File Fichero =new File (p2+p1+".txt");
				if (Fichero.createNewFile())
				    System.out.println("El fichero se ha creado correctamente");
				  else
				    System.out.println("el tamaño del fichero es de "+Fichero.length());
				}
			}

