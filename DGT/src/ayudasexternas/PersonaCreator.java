package ayudasexternas;

import objetos.Persona;

public class PersonaCreator {

	public static Persona crearPersona(String dni, String nombre, String fechaNacimiento) {
		
		Persona persona = new Persona(dni, nombre, fechaNacimiento);
		
		GuardadorObjetos.guardarPersona(persona);
		
		return persona;
		
	}
}
