package primerTrabajo;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

		
	public static void main(String[] args) {
		String Path = "C:\\";
		Scanner in = new Scanner(System.in);
		int mover=40;	
		File moverse = new File (Path);
		String[] listado = moverse.list();
		mostrar(moverse, Path, listado);
		
		while(mover!=-1) {
		    mover= in.nextInt();
		    
		    if(mover==-1) {
		    	System.out.println("Se Acabó");
		    	System.exit(0);
		    }
		    if (mover==0) {
		    	if (moverse.getParent()==null) {
		    		
		    	}else {
		    	Path=moverse.getParent();
		    	 moverse =new File (Path);
		    	 listado = moverse.list();
		    	mostrar(moverse, Path, listado);
		    	System.out.println(Path);
		    	}
		    }else {
		    	 Path=Path+"\\"+listado[(mover-1)];
		    	 moverse =new File (Path);
		    	 	if (moverse.isDirectory()) {
		    	 		listado = moverse.list();
		    	 		mostrar(moverse, Path, listado);
		    	 		System.out.println(Path);
		    }
		}
	}
}

public static void mostrar(File moverse, String Path, String listado2[]) {
	
	System.out.println("Listado De Directorios de: "+moverse.getAbsolutePath());
	System.out.println("-------------------------------------");
	    for (int i=0; i< listado2.length; i++) {
	    	File comprobar = new File(Path+listado2[i]);
	    	if(comprobar.isDirectory()) {
	        System.out.println("["+(i+1)+"].- "+listado2[i] + "	<Directorio>");
	    	}else {
	    	System.out.println("["+(i+1)+"].- "+listado2[i] + "	"+comprobar.length());
	    	}
	    }
	}
}