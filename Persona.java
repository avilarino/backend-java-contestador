package robot;

public class Persona {

	private String nombre;
	
	
	Persona(String nombre){
		this.setNombre(nombre);
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	
	
	
	
	
}
