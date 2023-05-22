package objetos;

public class Duenio {

	private Coche coche;
	private Persona persona;
	
	
	public Duenio(Coche coche, Persona persona) {
		
		this.coche = coche;
		this.persona = persona;
	}

	
	
	

	@Override
	public String toString() {
		return " " + coche + " " + persona + "]" +"\n";
	}





	public Coche getCoche() {
		return coche;
	}


	public void setCoche(Coche coche) {
		this.coche = coche;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
