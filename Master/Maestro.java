package Sistema_Inscripciones.V2;


/**
 * @author Kef
 * @version 1.0
 * @created 25-nov.-2015 05:16:59 p. m.
 */
public class Maestro extends Usuario {

	private String rfc;
	private double salario;
	public Curso m_Curso;

	public Maestro(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param rfc
	 * @param salario
	 */
	public Maestro(String rfc, double salario){

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
	public boolean eliminarAlumno(int a){
		return false;
	}

	/**
	 * 
	 * @param a
	 */
	public boolean eliminarRegistro(int a){
		return false;
	}

	public void obtenerCursosAsignados(){

	}

}