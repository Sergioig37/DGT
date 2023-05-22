package ayudasexternas;

import objetos.Coche;
import objetos.Duenio;
import objetos.Persona;

public class DuenioCreator {

	public static Duenio crearCochePersona(Coche coche, Persona persona) {
		
		Duenio cochePersona = new Duenio(coche, persona);
		
		return cochePersona;
	}
	
		
	
}
