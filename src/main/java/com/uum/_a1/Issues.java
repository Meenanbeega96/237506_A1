//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #237506
//Name: #Meenanbeega 

package com.uum._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class Issues {
    File file;
    String fileContent[][];
    LinkedList<String> listFileContent;
    public int fileNames;
    public int issues;
    Collection<File> all = new ArrayList<>();
    Collection<File> collectedFile = all;

    
     
     public void Result(String[] listJavaFile) {
        for (int i = 0; i < listJavaFile.length; i++) {
            try (BufferedReader br = new BufferedReader(new FileReader(listJavaFile[i]))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("public static void main")) {
                        issues++;
                    }
                }
            } catch (IOException e) {
            	System.out.println("Exceptions = " + e);
            }
            fileNames++;
        
   
        }
    
     }   

   

} 
  
