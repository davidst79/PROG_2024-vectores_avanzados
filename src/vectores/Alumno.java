package vectores;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellido;
	private int telefonoDeContacto;
	private Asignatura asignaturas[];
	private int contador;
	
	
	public String toString() {
		
		return "["+nombre +" , "+ apellido +" , "+ Arrays.toString(asignaturas)+"]";
	}
	
	
	public Alumno(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	
	public int Add(Asignatura numero) {
		
		if(contador < asignaturas.length) {
			
			asignaturas[contador] = numero;
			contador++;
			
			return contador -1;
		}
		return -1;
		
	}
	
	
	
}
