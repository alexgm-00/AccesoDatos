package frutas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Ejercicio1 {


	public static void main(String[] args) throws IOException {
		 FileWriter writer = null;
	        File file = new File("C:\\Users\\34722\\Desktop\\Directorio\\frutas.txt");
	        Scanner scan = new Scanner(file);
	        File file2 = new File("C:\\Users\\34722\\Desktop\\Directorio\\frutas.csv");
	        file.createNewFile();
	        writer = new FileWriter(file2);

	        String Principio="Id,Nombre,Precio,EsTemporada";
	        writer.append(Principio);
            writer.append("\n");
	        while (scan.hasNext()) {
	            String csv = scan.nextLine().replace(" ", ",");
	            System.out.println(csv);
	            writer.append(csv);
	            writer.append("\n");
	            writer.flush();
	        }
	    }
	}
	
	
