package com.example.demo.maputils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class MapUtils {
	
	public static Map<String,Object> objectToMap(Object data) throws IllegalArgumentException, IllegalAccessException{
		if(data == null){    
            return new HashMap<>();    
        }   
        Map<String, Object> map = new HashMap<String, Object>();    
        Field[] declaredFields = data.getClass().getDeclaredFields();   
        for (Field field : declaredFields) {    
             field.setAccessible(true);  
            
				map.put(field.getName(), field.get(data));
			
         }    
		return map;
	}

}
