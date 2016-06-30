/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.security.PublicKey;
import junit.framework.TestCase;

/**
 *
 * @author swbaiken
 */
public class DigitalCertificateTest extends TestCase {
    
    public DigitalCertificateTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

//    /**
//     * Test that the values set by the constructor are the default Java values
//     * 
//     * Variables are not allowed to be uninitialized. Test invalid.
//     */
//    public void testDigitalCertificate() {
//        System.out.println("DigitalCertificate");
//        DigitalCertificate instance = new DigitalCertificate();
//        String HolderName;
//        String Subject;
//        String Issuer;
//        String SerialNumber;
//        String ValidFrom;
//        String ValidTo;
//        PublicKey publicKey;
//        byte[] IssuerSignature;
//        
//        assertEquals(HolderName, instance.getHolderName());
//        assertEquals(Subject, instance.getSubject());
//        assertEquals(Issuer, instance.getIssuer());
//        assertEquals(SerialNumber, instance.getSerialNumber());
//        assertEquals(ValidFrom, instance.getValidFrom());
//        assertEquals(ValidTo, instance.getValidTo());
//        assertEquals(publicKey, instance.getpublicKey());
//        assertEquals(IssuerSignature, instance.getIssuerSignature());
//        
//    }
    
    /**
     * Test of setHolderName and getHolderName methods,
     * of class DigitalCertificate.
     */
    public void testSetGetHolderName() {
        System.out.println("setHolderName");
        String x = "testSetHolderName";
        String y = "";
        DigitalCertificate instance = new DigitalCertificate();
        
        instance.setHolderName(x);
        y = instance.getHolderName();
        
        assertEquals(x, y);
    }

    /**
     * Test of setSubject and getSubject methods,
     * of class DigitalCertificate.
     */
    public void testSetGetSubject() {
        System.out.println("setSubject");
        String x = "testSetSubject";
        String y = "";
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setSubject(x);
        y = instance.getSubject();
        
        assertEquals(x, y);
    }

    /**
     * Test of setIssuer and getIssuer methods, of class DigitalCertificate.
     */
    public void testSetGetIssuer() {
        System.out.println("setIssuer");
        String x = "testSetIssuer";
        String y = "";
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setIssuer(x);
        y = instance.getIssuer();
        
        assertEquals(x, y);
    }

    /**
     * Test of setSerialNumber and getSerialNumber methods, 
     * of class DigitalCertificate.
     */
    public void testSetGetSerialNumber() {
        System.out.println("setSerialNumber");
        String x = "testSetSerialNumber";
        String y = "";
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setSerialNumber(x);
        y = instance.getSerialNumber();
        
        assertEquals(x, y);
    }

    /**
     * Test of setValidFrom and getValidFrom methods,
     * of class DigitalCertificate.
     */
    public void testSetGetValidFrom() {
        System.out.println("setValidFrom");
        String x = "testSetValidFrom";
        String y = "";
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setValidFrom(x);
        y = instance.getValidFrom();
        
        assertEquals(x, y);
    }

    /**
     * Test of setValidTo and getValidTo methods, 
     * of class DigitalCertificate.
     */
    public void testSetGetValidTo() {
        System.out.println("setValidTo");
        String x = "testSetValidTo";
        String y = "";
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setValidTo(x);
        y = instance.getValidTo();
        
        assertEquals(x, y);
    }

    /**
     * Test of setPublicKey and getPublicKey methods, 
     * of class DigitalCertificate.
     */
    public void testSetGetPublicKey() {
        System.out.println("setPublicKey");
        PublicKey x = null;
        PublicKey y = null;
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setPublicKey(x);
        y = instance.getpublicKey();
        
        assertEquals(x, y);
    }

    /**
     * Test of setIssuerSignature and setIssuerSignature methods, 
     * of class DigitalCertificate.
     */
    public void testSetGetIssuerSignature() {
        System.out.println("setIssuerSignature");
        byte[] x = null;
        byte[] y = null;
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setIssuerSignature(x);
        y = instance.getIssuerSignature();
        
        assertEquals(x, y);
    }

//    /**
//     * Test of getHolderName method, of class DigitalCertificate.
//     */
//    public void testGetHolderName() {
//        System.out.println("getHolderName");
//        DigitalCertificate instance = new DigitalCertificate();
//        String expResult = "testGetHolderName";
//        String result = instance.getHolderName();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getSubject method, of class DigitalCertificate.
//     */
//    public void testGetSubject() {
//        System.out.println("getSubject");
//        DigitalCertificate instance = new DigitalCertificate();
//        String expResult = "testGetSubject";
//        String result = instance.getSubject();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getIssuer method, of class DigitalCertificate.
//     */
//    public void testGetIssuer() {
//        System.out.println("getIssuer");
//        DigitalCertificate instance = new DigitalCertificate();
//        String expResult = "testGetIssuer";
//        String result = instance.getIssuer();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getSerialNumber method, of class DigitalCertificate.
//     */
//    public void testGetSerialNumber() {
//        System.out.println("getSerialNumber");
//        DigitalCertificate instance = new DigitalCertificate();
//        String expResult = "testGetSerialNumber";
//        String result = instance.getSerialNumber();
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of getValidFrom method, of class DigitalCertificate.
//     */
//    public void testGetValidFrom() {
//        System.out.println("getValidFrom");
//        DigitalCertificate instance = new DigitalCertificate();
//        String expResult = "testGetValidFrom";
//        String result = instance.getValidFrom();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getValidTo method, of class DigitalCertificate.
//     */
//    public void testGetValidTo() {
//        System.out.println("getValidTo");
//        DigitalCertificate instance = new DigitalCertificate();
//        String expResult = "testGetValidTo";
//        String result = instance.getValidTo();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getpublicKey method, of class DigitalCertificate.
//     */
//    public void testGetpublicKey() {
//        System.out.println("getpublicKey");
//        DigitalCertificate instance = new DigitalCertificate();
//        PublicKey expResult = null;
//        PublicKey result = instance.getpublicKey();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getIssuerSignature method, of class DigitalCertificate.
//     */
//    public void testGetIssuerSignature() {
//        System.out.println("getIssuerSignature");
//        DigitalCertificate instance = new DigitalCertificate();
//        byte[] expResult = null;
//        byte[] result = instance.getIssuerSignature();
//        assertEquals(expResult, result);
//    }
    
}
