//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #237506
//Name: #Meenanbeega 

package com.uum._a1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class AssRealTime {
    
     private static Object issues;

  
    public static void main(String[] args) throws IOException {
    
   
        
     List<String> fileNames = new ArrayList<>();
      //List<String> issues = new ArrayList<>();
     
     
     
     
     DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\Users\\ANUBIRIA\\Documents\\NetBeansProjects\\Assignment 2"));
     for (Path path : directoryStream) {
         fileNames.add(path.toString());
     }
      System.out.println("Number of Files: "+ fileNames.size());
     // System.out.println("Number of Files: "+ issues.size());
      
     
  }

}
