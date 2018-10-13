package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.*;

import org.json.simple.JSONObject;

@Controller
public class HelloController {
	private KeyService keyService = new KeyService();
	@RequestMapping(value = "/{KeyId}" , method = RequestMethod.GET, produces = "application/json")
	public ModelAndView retrieveValueForKey(@PathVariable String KeyId) {
		KeyModel k = keyService.retrieveKey(KeyId);
		if(k != null){
			JSONObject json = new JSONObject();
			json.put("Value", k.getValue());
			json.put("Key", k.getKey());
			return new ModelAndView("hellopage.jsp", "msg", json);	
		}
		else{
			return new ModelAndView("hellopage.jsp", "msg", "Ressource Not Found");
		}
		
		
	}
}
