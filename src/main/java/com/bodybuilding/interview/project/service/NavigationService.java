/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodybuilding.interview.project.service;

import com.bodybuilding.interview.project.utility.JsonReader;
import com.bodybuilding.interview.project.web.json.Navigation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zula.weynishet
 */
public class NavigationService {
 // private static final String fileName="src/main/resources/file/navigation.json";
    private static final String fileName="navigation.json";
  public Navigation getnavigation() throws FileNotFoundException, IOException{
   JsonReader jsonReader=new JsonReader(); 
  Navigation navigation= jsonReader.parseJsonFromFile(fileName);
  return navigation;
  } 
  
  
  public static void main(String args[]) throws IOException{
      
  FileReader fr; 
    
           File myFile = new File(fileName);
           System.out.println(myFile.getAbsolutePath());

         NavigationService ne=new NavigationService();
     
      try {
          Navigation navig=ne.getnavigation();
          System.out.println(navig);
      } catch (FileNotFoundException ex) {
          Logger.getLogger(NavigationService.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}
