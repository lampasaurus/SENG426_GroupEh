/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tristan
 */
public class EChequeIOTest {
    
    public EChequeIOTest() {
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
     * Test of savecheque method, of class EChequeIO.
     */
    @Test
    public void testSavecheque() throws Exception {
        System.out.println("savecheque");
        ECheque obj = new ECheque();
        obj.setaccountNumber("testSavecheque");
        String filename = "testSavecheque";
        EChequeIO instance = new EChequeIO();
        instance.savecheque(obj, filename);
        
        testReadcheque(filename);
    }

    /**
     * Test of readcheque method, of class EChequeIO.
     */
    @Test
    public void testReadcheque(String filename) throws Exception {
        System.out.println("readcheque");        
        EChequeIO instance = new EChequeIO();
        
        ECheque result = instance.readcheque(filename);
        assertEquals(filename, result.getaccountNumber());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
