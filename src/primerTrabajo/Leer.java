package primerTrabajo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Leer {

	public static void main(String[] args) throws IOException {
		 Scanner lee =new Scanner (new File ("C:\\Users\\34722\\Desktop\\Directorio\\ejercicio1.txt"));
		 try {   
         while((lee.hasNextLine())) {
        	 String[] parts = (lee.nextLine()).split(" ");
        	 
        	 for (int i=0;i<parts.length;i++) {
        		 if (parts[i].matches("[a-z]*")) {
        			 System.out.println("Texto: "+parts[i]);
        		 }else {
        			 System.out.println("Numero: "+parts[i]);
        		 }
         }
      }
  }
  catch(Exception e){
     e.printStackTrace();
  }finally{
   
  
     }
  }
}

