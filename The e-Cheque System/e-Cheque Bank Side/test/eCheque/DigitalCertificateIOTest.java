/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.io.File;
import java.io.IOException;
import junit.framework.TestCase;

/**
 *
 * @author swbaiken
 */
public class DigitalCertificateIOTest extends TestCase {
    
    public DigitalCertificateIOTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        /* Delete created file */
        File fp = new File("./output.txt");
        if(fp.exists() && !fp.isDirectory()) { 
            fp.delete();
        }
        super.tearDown();
    }

    /**
     * Test of SaveDC method, of class DigitalCertificateIO.
     */
    public void testSaveDC() {
        System.out.println("SaveDC");
        DigitalCertificate a = null;
        String filePath;
        DigitalCertificateIO instance = new DigitalCertificateIO();
        int exceptions;
                
        /**
         * Test response to empty file path.
         */
        
        filePath = "";
        exceptions = 0;
        
        try {
            instance.SaveDC(a, filePath);
        }
        catch (IOException e) {
            exceptions++;
        }
        
        /* Exception expected */
        assertEquals(exceptions, 1);
        
        
        /**
         * Test standard operation.
         */
        
        filePath = "./output.txt";
        exceptions = 0;
        
        try {
            instance.SaveDC(a, filePath);
        }
        catch (IOException e) {
            exceptions++;
        }        
        /* No exception expected */
        assertEquals(exceptions, 0);
        
        /**
         * Unable to test if file stream closed correctly.
         */
    }

    /**
     * Test of readDigitalCertificate method, of class DigitalCertificateIO.
     */
    public void testReadDigitalCertificate() {
        System.out.println("readDigitalCertificate");
        String filePath;
        DigitalCertificateIO instance = new DigitalCertificateIO();
        DigitalCertificate expResult = null;
        DigitalCertificate result;
        int exceptions = 0;
        
        
        filePath = "./output.txt";
        exceptions = 0;
        try {
            instance.SaveDC(expResult, filePath);
        }
        catch (IOException e) {
            exceptions += 1;
        }
        try {
            result = instance.readDigitalCertificate(filePath);
            assertEquals(expResult, result);
        }
        catch (IOException e) {
            exceptions += 2;
        }
        catch (ClassNotFoundException e) {
            exceptions += 4;
        }
        /* No exceptions expected at this time */
        assertEquals(exceptions, 0);
        
        
        filePath = "";
        exceptions = 0;
        try {
            result = instance.readDigitalCertificate(filePath);
            assertEquals(expResult, result);
        }
        catch (IOException e) {
            exceptions += 1;
        }
        catch (ClassNotFoundException e) {
            exceptions += 2;
        }
        
        /* Expected IOException, do not expect ClassNotFoundException*/
        assertEquals(exceptions, 1);
    }
    
}
