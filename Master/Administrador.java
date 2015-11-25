package Sistema_Inscripciones.V2;


/**
 * @author Kef
 * @version 1.0
 * @created 25-nov.-2015 05:16:52 p. m.
 */
public class Administrador extends Usuario {

	private int salario;
	public Curso m_Curso;

	public Administrador(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param salario
	 */
	public Administrador(int salario){

	}

	/**
	 * 
	 * @param nombre
	 * @param Categoria
	 */
	public boolean altaCurso(String nombre, String Categoria){
		return false;
	}

	public boolean asignarProfesorCurso(){
		return false;
	}

	public boolean bajaCurso(){
		return false;
	}

	public boolean editarCurso(){
		return false;
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

}