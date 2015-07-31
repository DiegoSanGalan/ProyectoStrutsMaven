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


	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	/**
	 * Validate sobreescrito.
	 * Por Aquí pasa antes de ir a execute y si se ejecuta addActionError
	 * es como si hiciera return input; que en el struts.xml
	 * ;
	 */
	@Override
	public void validate() {
		if (coche.getMarca().equals("Seat"))
		{
			addActionMessage("Tu coche es un Seat");
		}
		if (coche.getMarca().length()<5)
		{
			addActionMessage("El numero de letras de tu coche son: " + coche.getMarca().length());
		}
		if (coche.getMatricula().equals("666"))
		{
			addActionError("Satanas no tiene coche jajajaja");
		}
	}

}
