package clasesaction;

import java.sql.Connection;

import JDBC.conexionJDBC.ConexionBD;
import JDBC.jdbc.clasesDAO.EmpleadoDAO;
import JDBC.jdbc.clasesDTO.Empleados;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;


/**
 * Clase Action para buscar empleados
 * @author Diego Santamaría
 *
 */
public class ActionBuscarEmpleado extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmpleadoDAO empleadoDAO;
	private Empleados empleadoDTO;
	private String id;
	
	/**
	 * @return the empleadoDAO
	 */
	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
	}
	
	/**
	 * @param empleadoDAO the empleadoDAO to set
	 */
	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}
	
	/**
	 * @return the empleadoDTO
	 */
	public Empleados getEmpleadoDTO() {
		return empleadoDTO;
	}
	
	/**
	 * @param empleadoDTO the empleadoDTO to set
	 */
	
	//@TypeConversion(converter="la clase que me cree para convertir de string a objeto")
	public void setEmpleadoDTO(Empleados empleadoDTO) {
		this.empleadoDTO = empleadoDTO;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	/** 
	 * 
	 * En el método execute creo la conexion e inicializo las variables
	 * empleadoDTO y empleadoDAO.
	 * Ejecuto el método de empleadoDAO leerEmpleado por id y lo guardo
	 * en empleadoDTO para acceder desde el mostraempleado.jsp
	 */
	
	@Override
	public String execute() throws Exception {
		
		
		//ActionContext.getContext().get("Application"); // Para acceder directamente a los distintos sacos lo haremos así.
		//ActionContext.getContext().get("Context"); // Para acceder directamente a los distintos sacos lo haremos así.
		//ActionContext.getContext().getContext(); // Para acceder directamente a los distintos sacos lo haremos así.
		Connection conn = null;
		conn = ConexionBD.obtenerConexion();
		empleadoDTO = new Empleados();
		empleadoDAO = new EmpleadoDAO();
		
		empleadoDTO = empleadoDAO.leerEmpleado(id, conn);
		
		
		conn.close();
		
		if (null!=empleadoDTO)
		{
			return SUCCESS; // si existe el empleado buscado
		}
		else
		{
			return INPUT; // en caso de que no exista el empleado
		}
		
		
	}
	
	
	
	

}
