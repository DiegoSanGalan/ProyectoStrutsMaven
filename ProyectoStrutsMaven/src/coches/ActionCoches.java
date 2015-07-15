package coches;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

public class ActionCoches extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Coches coche = null;
	

	/**
	 * Desde aqui llamamos a la clase que convierte el tipo de String a tipo Coche
	 * @return the coche
	 */
	@TypeConversion(converter="coches.ConversorTipoCoche")
	public Coches getCoche() {
		return coche;
	}


	/**
	 * Desde aqui con typeconversion lo que hacemos es llamar al conversor de tipo
	 * personalizado 
	 * @param coche the coche to set
	 */
	@TypeConversion(converter="coches.ConversorTipoCoche")
	public void setCoche(Coches coche) {
		this.coche = coche;
	}


	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		
		return SUCCESS;
	}

}
