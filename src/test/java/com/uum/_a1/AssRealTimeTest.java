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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AssRealTimeTest {
    public AssRealTimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testAssRealTime() throws IOException {
        System.out.println("main");
        String[] args = null;
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\Users\\ANUBIRIA\\Documents\\NetBeansProjects\\Assignment 2"));
      
        
    } 
}
