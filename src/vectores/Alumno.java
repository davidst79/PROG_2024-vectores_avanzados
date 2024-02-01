package vectores;

public class Alumno {

	private String nombre;
	private String apellido;
	private int telefonoDeContacto;
	private int asignaturas[];
	private int contador;
	
	
	
	
	
	public Alumno(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	
	public int Add(int numero) {
		
		if(contador < asignaturas.length) {
			
			asignaturas[contador] = numero;
			contador++;
			
			return contador -1;
		}
		return -1;
		
	}
	
	
	
}
