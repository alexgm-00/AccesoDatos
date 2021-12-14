package tema5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		
		String entrada;
		String nuevo ="";
		 try {
			 mostrar();
	          
	            System.out.println("Nombre de Restaurant");
	            entrada= in.nextLine();
	            nuevo=entrada;
	            System.out.println("Nombre de Direccion");
	            entrada= in.nextLine();
	            nuevo= nuevo+","+entrada;
	            System.out.println("Nombre de Ciudad");
	            entrada= in.nextLine();
	            nuevo= nuevo+","+entrada;
	            System.out.println("Nombre de State");
	            entrada= in.nextLine();
	            nuevo= nuevo+","+entrada;
	            System.out.println("Nombre de Zipcode");
	            entrada= in.nextLine();
	            nuevo= nuevo+","+entrada;
	            System.out.println(nuevo);
	            
	            CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\34722\\Desktop\\Directorio\\Restaurants.csv" ,true));
	            String[] record = nuevo.split(",");
	            writer.writeNext(record);
	            
	            writer.close();
	            mostrar();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	private static void mostrar() throws IOException {
int i=1;
		CSVReader Leer = new CSVReader(new FileReader("C:\\Users\\34722\\Desktop\\Directorio\\Restaurants.csv"));
        String[] fila = null;
        while((fila = Leer.readNext()) != null) {
            System.out.println( i+"	"+fila[0]+ " |	" + fila[1] + "	| " + fila[2]+ " | " + fila[3] + " | " + fila[4]);
            i++; 
        }
        Leer.close();
	}
	}
