package objetos;

import java.util.ArrayList;

public class Persona {

	private String dni;
	private String nombre;
	private String fechaNacimiento;
	private ArrayList<Coche> coches;
	
	public Persona(String dni, String nombre, String fechaNacimiento) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		coches = new ArrayList<Coche>();
		
	}

	
	
	
	
	@Override
	public String toString() {
		return "[" + dni + " , " + nombre + " , " + fechaNacimiento +" " +coches +  "]" +"\n";
	}



	



	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public ArrayList<Coche> getCoches(){
		return coches;
	}
	
	public void setCoches(ArrayList<Coche> coches){
		this.coches = coches;
	}
	
}
