package Sistema_Inscripciones.V2;


/**
 * @version 1.0
 * @created 25-nov.-2015 05:16:54 p. m.
 */
public class Alumno extends Usuario {

	private int matricula;
	private int tipoAlumno;
	public Curso m_Curso;

	public Alumno(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Alumno(int id, String name){

	}

	/**
	 * 
	 * @param a
	 */
	public boolean editarRegistro(int a){
		return false;
	}

	/**
	 * 
	 * @param a
	 */
	public boolean eliminarRegistro(int a){
		return false;
	}

	/**
	 * 
	 * @param id_curso
	 */
	public boolean eliminarseCurso(int id_curso){
		return false;
	}

	public void obtenerCursosTomados(){

	}

	/**
	 * 
	 * @param a
	 */
	public boolean registrarseCurso(int a){
		return false;
	}

}