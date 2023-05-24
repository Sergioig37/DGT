package datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;


import objetos.Persona;

public class Write {

	public static void escribir(Iterator<Persona> lista) {
		
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		try {
			FileWriter ficheroSalida = (new FileWriter("C:\\Users\\Usuario\\Documents\\RESULTADO.txt"));
			
			while(lista.hasNext()) {
				personas.add(lista.next());
			}
			ficheroSalida.write(personas.toString());
			ficheroSalida.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		
	
		}
	}
}
	

