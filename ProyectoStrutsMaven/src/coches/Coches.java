package coches;

public class Coches {

	private String marca;
	private String matricula;
	/**
	 * @param marca
	 * @param matricula
	 */
	public Coches(String marca, String matricula) {
		super();
		this.marca = marca;
		this.matricula = matricula;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", matricula=" + matricula + "]";
	}
	
	
}
