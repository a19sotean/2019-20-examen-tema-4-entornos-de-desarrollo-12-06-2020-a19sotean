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
 * @author Andrea Solís
 *
 */
enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};

/**
 * La clase Estudiante es pública y extiende a Persona.
 * @author Andrea Solís
 *
 */
public class Estudiante extends Persona{
	Curso curso;
	/**
	 * Estudiante está protegido.
	 * @author Andrea Solís
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
	 * El método getCurso está protegido.
	 * @author Andrea Solís
	 * @return the curso
	 */
	protected Curso getCurso() {
		return curso;
	}

	/**
	 * El método setCurso está protegido.
	 * @author Andrea Solís
	 * @param curso the curso to set
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
