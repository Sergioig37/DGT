package go;

import java.util.ArrayList;
import java.util.Iterator;

import ayudasexternas.GuardadorObjetos;
import datos.ReadCoche;
import datos.ReadDuenio;
import datos.ReadPersona;
import datos.Write;
import objetos.Coche;
import objetos.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReadCoche.readFiles("C:\\Users\\Mañana\\Documents\\COCHE.txt");
		
		ReadPersona.readFiles("C:\\Users\\Mañana\\Documents\\DNI.txt");
		
		ReadDuenio.readFiles("C:\\Users\\Mañana\\Documents\\DNICOCHE.txt");
		
		Write.escribir(GuardadorObjetos.sacarPersonas());
		
	}

}
