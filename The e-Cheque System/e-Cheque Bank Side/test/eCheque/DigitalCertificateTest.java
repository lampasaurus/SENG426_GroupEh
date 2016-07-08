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
        /* Generate public/private key pair */
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        keyGen.initialize(1024, random);
        KeyPair pair = keyGen.generateKeyPair();
        PublicKey x = pair.getPublic();
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
        byte[] x = new byte[] { 0xA5 };
        byte[] y = null;
        
        DigitalCertificate instance = new DigitalCertificate();
        instance.setIssuerSignature(x);
        y = instance.getIssuerSignature();
        
        assertEquals(x, y);
    }

}
