package com.study.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;


//import java.servlet.HttpServletRequest;

public class DTO {
	
	public static Map<String, String> getParams(HttpServletRequest request) {
		Map<String, String> dataMap = new HashMap<>();
		// 맵에서 key만 들고 올 수 있는거 
		Set<String> keySet = request.getParameterMap().keySet();
		keySet.forEach(key -> {
			dataMap.put(key, request.getParameter(key));
		});
		
		return dataMap;
	}
}
