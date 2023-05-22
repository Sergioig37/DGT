package datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import objetos.Duenio;

public class Write {

	public static void escribir(Iterator<Duenio> lista) {
		
		BufferedWriter ficheroSalida;
		ArrayList<Duenio> personasCoches = new ArrayList<Duenio>();
		
		try {
			ficheroSalida = new BufferedWriter(new FileWriter("C:\\Users\\Mañana\\Documents\\RESULTADO.txt"));
			
			while(lista.hasNext()) {
				personasCoches.add(lista.next());
			}
			ficheroSalida.write(personasCoches.toString());
			ficheroSalida.close();
		}
		catch(Exception e) {
			
		
	
		}
	}
}
	

