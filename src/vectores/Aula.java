package vectores;

import java.util.Arrays;

public class Aula {

	
	private Alumno alumnos[];
	private int contador;
	
	public Aula() {
		
		alumnos = new Alumno[5];
		contador = 0;
	}
	
	
	public void alumnosAdd(Alumno alumno) {
		
		alumnos[contador] = alumno;
		contador++;	
	}
	
	
	public String toString() {
		
		return Arrays.toString(alumnos);
	}
	
	
	
}
