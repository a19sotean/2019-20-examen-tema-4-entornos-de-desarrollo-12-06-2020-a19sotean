/**
 * Tenemos la clase persona de la cual hay una super clase.
 * @author Andrea Solís
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
	 * El método getNombre está protegido.
	 * @author Andrea Solís
	 * @return el nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * El método setNombre está protegido.
	 * @author Andrea Solís
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * El método getApellidos está protegido.
	 * @author Andrea Solís
	 * @return the apellidos
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * El método setApellidos está protegido.
	 * @author Andrea Solís
	 * @param apellidos the apellidos to set
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * El método getNif está protegido.
	 * @author Andrea Solís
	 * @return the nif
	 */
	protected String getNif() {
		return nif;
	}

	/**
	 * El método setNif está protegido.
	 * @author Andrea Solís
	 * @param nif the nif to set
	 */
	protected void setNif(String nif) {
		this.nif = nif;
	}

}