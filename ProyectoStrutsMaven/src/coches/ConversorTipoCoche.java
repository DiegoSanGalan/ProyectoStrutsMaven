package coches;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class ConversorTipoCoche extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Coches coche = null;
		
		/*
		try {
			coche = (Coches) arg2.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		coche = new Coches(arg1[0], arg1[1]);
		return coche;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		String cocheString = "";
		Coches coche = (Coches) arg1;
		cocheString = coche.toString();
		return cocheString;
	}

}
