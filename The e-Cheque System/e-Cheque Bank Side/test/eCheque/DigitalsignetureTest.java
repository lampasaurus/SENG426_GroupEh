/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import junit.framework.TestCase;

/**
 *
 * @author swbaiken
 */
public class DigitalsignetureTest extends TestCase {
    
    public DigitalsignetureTest(String testName) {
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
     * Test of signeture method, of class Digitalsigneture.
     * Uses code from 
     * https://docs.oracle.com/javase/tutorial/security/apisign/step2.html
     */
    public void testSigneture() throws Exception {
        System.out.println("signeture");
        String message = "Test of signeture method, of class Digitalsigneture.";
        String badMessage = "Test of bad method, of class Digitalsigneture.";
        Digitalsigneture instance = new Digitalsigneture();
        boolean verificationResult;
        byte[] result;
        
        /* Generate public/private key pair */
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        keyGen.initialize(1024, random);
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey privKey = pair.getPrivate();
        PublicKey pubKey = pair.getPublic();
        
        /* sign message */
        result = instance.signeture(message, privKey);
        
        /* check signature on message */
        Signature checkMessage = Signature.getInstance("SHA1withRSA");
        checkMessage.initVerify(pubKey);
        checkMessage.update(message.getBytes());
        verificationResult = checkMessage.verify(result);
        
        assertTrue(verificationResult);
    }

    /**
     * Test of verifySignature method, of class Digitalsigneture.
     */
    public void testVerifySignature() throws Exception {
        System.out.println("verifySignature");
        byte[] messagesign = null;
        String message = "Test of verifySignature method, of class Digitalsigneture.";
        Digitalsigneture instance = new Digitalsigneture();
        boolean result;
        
        /* Generate public/private key pair */
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        keyGen.initialize(1024, random);
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey privKey = pair.getPrivate();
        PublicKey pubKey = pair.getPublic();
        
        /* Sign a message */        
        Signature signmessage = Signature.getInstance("SHA1withRSA");
        signmessage.initSign(privKey);
        signmessage.update(message.getBytes());
        byte[]signature = signmessage.sign();
        
        /* Check signature */
        result = instance.verifySignature(messagesign, message, pubKey);
        assertTrue(result);
		  
		  /* Check for failure on mismatched message */
		  result = instance.verifySignature(messagesign, badMessage, pubKey);
		  assertFalse(result);
    }
    
}
