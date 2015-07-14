package clasesaction;

import clasesaction.Persona;

import com.opensymphony.xwork2.ActionSupport;

public class ActionPersona extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private int edad;
	
	private Persona person = null;
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		//el filtro lo setea automáticamente, ya tienen un valor
		// lo muestro para verlo.
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Apellido = " + this.apellido);
		System.out.println("Edad = " + this.edad);
		
		person = new Persona(nombre, apellido, edad);
		
		
		
		
		return SUCCESS;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the person
	 */
	public Persona getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Persona person) {
		this.person = person;
	}
	
	
	
}
