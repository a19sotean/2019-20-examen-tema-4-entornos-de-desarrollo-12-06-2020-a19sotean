/**
 * Tenemos la clase persona de la cual hay una super clase.
 * @author Andrea Sol�s
 *
 */
public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String nif;

	public Persona() {
		super();
	}

	/**
	 * El m�todo getNombre est� protegido.
	 * @author Andrea Sol�s
	 * @return el nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * El m�todo setNombre est� protegido.
	 * @author Andrea Sol�s
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * El m�todo getApellidos est� protegido.
	 * @author Andrea Sol�s
	 * @return the apellidos
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * El m�todo setApellidos est� protegido.
	 * @author Andrea Sol�s
	 * @param apellidos the apellidos to set
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * El m�todo getNif est� protegido.
	 * @author Andrea Sol�s
	 * @return the nif
	 */
	protected String getNif() {
		return nif;
	}

	/**
	 * El m�todo setNif est� protegido.
	 * @author Andrea Sol�s
	 * @param nif the nif to set
	 */
	protected void setNif(String nif) {
		this.nif = nif;
	}

}