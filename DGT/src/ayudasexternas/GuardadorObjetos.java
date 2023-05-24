package ayudasexternas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import objetos.Coche;
import objetos.Persona;

public class GuardadorObjetos {

	private static HashMap<String, Coche> coches = new HashMap<String, Coche>();
	private static HashMap<String, Persona> personas = new HashMap<String, Persona>();
	
	public static void guardarCoche(Coche coche) {
		
		coches.put(coche.getMatricula(), coche);
		
	}
	
	public static void guardarPersona(Persona persona) {
		
		personas.put(persona.getDni(), persona);
		
	}
	
	public static void guardarDuenio(String coche, String persona){
		
		
		personas.get(persona).getCoches().add(coches.get(coche));
	
	
	}
	
	public static Iterator<Persona> sacarPersonas() {
		
		ArrayList<Persona> personasLista = new ArrayList<Persona>();
		
		personasLista.addAll(personas.values());
		
		return personasLista.iterator();
		
	}
	
}
