/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhntools.mvnitext7templates.helloWorld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author najlanetbean
 */
public class HelloWorldIT {
/**
 * Simple Hello World example TESTS.
 */

    
    public HelloWorldIT() {
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

    /**
     * Test of main method, of class HelloWorld.
     * @throws java.lang.Exception
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("Test Pdf Creation");
        String[] args = null;
        HelloWorld.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createPdf method, of class HelloWorld.
     * @throws java.lang.Exception
     */
    @Test
    public void testCreatePdf() throws Exception {
        System.out.println("createPdf");
        String dest;
        dest = "resultsIT/sresultsIT.pdf";
        HelloWorld instance = new HelloWorld();
        instance.createPdf(dest);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
