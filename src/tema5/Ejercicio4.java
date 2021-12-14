package tema5;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\34722\\Desktop\\Directorio\\Restaurants2.csv"));
    	bw.write("");
    	bw.close();
		try {
            CSVReader Leer = new CSVReader(new FileReader("C:\\Users\\34722\\Desktop\\Directorio\\Restaurants.csv"));
            String[] fila = null;
            while((fila = Leer.readNext()) != null) {
                if (fila[4].matches("^[6][0-9]*$")) {
                 }else {
                	String nuevo = fila[0]+","+fila[1]+","+fila[2]+","+fila[3]+","+fila[4];
                	CSVWriter writer1 = new CSVWriter(new FileWriter("C:\\Users\\34722\\Desktop\\Directorio\\Restaurants2.csv", true));
                	String[] record = nuevo.split(",");
    	            writer1.writeNext(record);
    	            writer1.close();
                }
            }
            Leer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
