package refactorizacion;
/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorizacion
Extrae una superclase con los campos
	nombre
	apellidos
	nif
y los metodos
	getNombre(), setNombre()
	getApellidos(), setApellidos()
	getNif(), setNif()*/
	

/**
 * Se enumeran los tipos de curso.
 * @author Andrea Sol�s
 *
 */
enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};

/**
 * La clase Estudiante es p�blica y extiende a Persona.
 * @author Andrea Sol�s
 *
 */
public class Estudiante extends Persona{
	Curso curso;
	/**
	 * Estudiante est� protegido.
	 * @author Andrea Sol�s
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param curso
	 */
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * El m�todo getCurso est� protegido.
	 * @author Andrea Sol�s
	 * @return the curso
	 */
	protected Curso getCurso() {
		return curso;
	}

	/**
	 * El m�todo setCurso est� protegido.
	 * @author Andrea Sol�s
	 * @param curso the curso to set
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
