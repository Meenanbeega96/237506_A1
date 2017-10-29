//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #237506
//Name: #Meenanbeega 

package com.uum._a1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class IssuesTest {
    
    public IssuesTest() {
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
    public void testIssuesTest() {
        System.out.println("Issues Test");
        String[] listJavaFile = new String[0];
        Issues instance = new Issues();
        instance.Result(listJavaFile);

    
        
    } 
}
