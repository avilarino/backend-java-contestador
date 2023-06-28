package robot;

public class Robot {

	String nombre;
	Persona cliente;

	Robot(){
		
	}
	
	
	public void saludar() {
		nombre = "pepito-robot";
		System.out.print("hola mi nombre es " + nombre);
	}
	
	public void saludar(Persona cliente) {
		System.out.print("hola " + cliente.getNombre() + "mi nombre es " + nombre);
	}
}
