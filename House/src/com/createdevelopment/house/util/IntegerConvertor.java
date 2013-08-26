package com.createdevelopment.house.util;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class IntegerConvertor extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// TODO Auto-generated method stub
		if (Integer.class == toClass) {  
            String doubleStr = values[0];  
         
            Integer d = Integer.parseInt(doubleStr);  
            return d;  
        }  
        return 0;  

	}

	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		   return o.toString();  

	}

}
