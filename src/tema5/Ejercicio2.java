package tema5;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
public class Ejercicio2 {

	   public static void main(String[] args) throws IOException { 
		   try {
	            CSVReader Leer = new CSVReader(new FileReader("C:\\Users\\34722\\Desktop\\Directorio\\Restaurants.csv"));
	            String[] fila = null;
	            while((fila = Leer.readNext()) != null) {
	                if (fila[4].matches("^[6][0-9]*$")) {
	                System.out.println(fila[0]+ "	|	" + fila[1] + "	|	" + fila[2]+ "	|	" + fila[3] + "	|	" + fila[4]);
	                }
	            }
	            Leer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
