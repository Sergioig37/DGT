package ayudasexternas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import objetos.Coche;
import objetos.Duenio;
import objetos.Persona;

public class GuardadorObjetos {

	private static HashMap<String, Coche> coches = new HashMap<String, Coche>();
	private static HashMap<String, Persona> personas = new HashMap<String, Persona>();
	private static ArrayList<Duenio> cochesYPersonas = new ArrayList<Duenio>();
	
	public static void guardarCoche(Coche coche) {
		
		coches.put(coche.getMatricula(), coche);
		
	}
	
	public static void guardarPersona(Persona persona) {
		
		personas.put(persona.getDni(), persona);
		
	}
	
	public static void guardarDuenio(String coche, String persona){
		
		
	cochesYPersonas.add(DuenioCreator.crearCochePersona(coches.get(coche),  personas.get(persona)));
	
		
	}
	
	public static Iterator<Duenio> devolverListaFinal(){
		
		return cochesYPersonas.iterator();
	}
}
