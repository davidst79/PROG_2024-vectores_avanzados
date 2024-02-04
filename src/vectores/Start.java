package vectores;

public class Start {

	public static void main(String[] args) {
		
		
		Aula aulas = new Aula();
		
		Alumno alumno1 = new Alumno("David", "Suarez");
		aulas.alumnosAdd(alumno1);
		System.out.println(aulas);
		

	}

}
