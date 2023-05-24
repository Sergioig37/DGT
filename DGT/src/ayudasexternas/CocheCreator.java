package ayudasexternas;

import objetos.Coche;

public class CocheCreator {

	public static Coche crearCoche(String matricula, String marca, String modelo, String color) {
		
		Coche coche = new Coche(matricula, marca, modelo, color);
		
		GuardadorObjetos.guardarCoche(coche);
		
		return coche;
		
	}
}
