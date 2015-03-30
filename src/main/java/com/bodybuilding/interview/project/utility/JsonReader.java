/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodybuilding.interview.project.utility;

import com.bodybuilding.interview.project.web.json.Navigation;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author zula.weynishet
 */
public class JsonReader  {
   public Navigation parseJsonFromFile(String fileName) throws FileNotFoundException, IOException{
       File myFile = new File(fileName);
       System.out.println(myFile.getAbsolutePath());
       String result = "";
 
	ClassLoader classLoader = getClass().getClassLoader();
	try {
	    result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
	} catch (IOException e) {
		e.printStackTrace();
	}
 
       
      return new Gson().fromJson(result, Navigation.class);  
   } 
   
    private Object getValue (JSONObject json, String path) throws JSONException  {
		int k = path.indexOf(".");
		if(k >= 0){
			String key = path.substring(0, k);
			path = path.substring(k+1);
			return getValue((JSONObject)json.getJSONObject(key), path);
		}else{
			return json.get(path);
		}
	}
}
