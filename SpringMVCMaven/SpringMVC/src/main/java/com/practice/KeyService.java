package com.practice;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.xmlbeans.ResourceLoader;
import org.omg.CORBA.portable.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.practice.KeyModel;

@Component
public class KeyService {
	public static BufferedReader br;
	static Map<String, Integer> map = new HashMap<String, Integer>();
	static {
        try{
        	String line = "";
        	java.io.InputStream resource = new ClassPathResource("ABC.txt").getInputStream();
        	br = new BufferedReader(new InputStreamReader(resource));	
        	while ((line = br.readLine()) != null){
        		String[] Keys = line.split(",");
        		map.put(Keys[0], Integer.parseInt(Keys[1]));
        	}
        }
        catch(Exception e){
        	e.printStackTrace();
        }
	}
	
	public KeyModel retrieveKey(String K) {
		try{
	            if(map.containsKey(K)){
	            	KeyModel found = new KeyModel(K,map.get(K));
	            	System.out.println("Mila");
	            	return found;
	            }
	            else{
	            	System.out.println("Nahi Mila");
	            	return null;
	            }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}