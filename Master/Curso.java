package Sistema_Inscripciones.V2;


/**
 * @version 1.0
 * @created 25-nov.-2015 05:16:56 p. m.
 */
public class Curso {

	private String categoria;
	private String fechaCreacion;
	private int idCurso;
	private String nombreCurso;
	public Alumno m_Alumno;

	public Curso(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param idCurso
	 * @param nombreCurso
	 * @param Categoria
	 * @param fechaCreacion
	 */
	public Curso(int idCurso, String nombreCurso, String Categoria, String fechaCreacion){

	}

	/**
	 * 
	 * @param a
	 */
	public boolean añadirAlumno(Alumno a){
		return false;
	}

	/**
	 * 
	 * @param a
	 */
	public boolean asignarMaestro(Maestro a){
		return false;
	}

	/**
	 * 
	 * @param a
	 */
	public boolean editarAlumno(int a){
		return false;
	}

	/**
	 * 
	 * @param a
	 */
	public boolean eliminarAlumno(int a){
		return false;
	}

}