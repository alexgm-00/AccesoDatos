package primerTrabajo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Leer2 {

	public static void main(String[] args) {
		
		      try {
		    	  Scanner lee =new Scanner (new File ("C:\\Users\\34722\\Desktop\\Directorio\\ejercicio2.txt"));
		    
			         while((lee.hasNextLine())) {
			        	 String[] parts = (lee.nextLine()).split(" ");
			        	 
			        	 for (int i=0;i<parts.length;i++) {
			        		 if (parts[i].matches("[a-z]*")) {
			        			 System.out.println("Palabra: "+parts[i]);
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
		