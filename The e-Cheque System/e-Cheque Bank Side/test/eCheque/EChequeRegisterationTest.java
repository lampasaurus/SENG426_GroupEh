/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import static junit.framework.TestCase.assertEquals;
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
public class EChequeRegisterationTest {
    
    public EChequeRegisterationTest() {
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
     * Test of setBankName method, of class EChequeRegisteration.
     */
    @Test
    public void testSetBankName() {
        System.out.println("setBankName");
        String x = "testSetaccountholder";
        String y = "";
        EChequeRegisteration instance = new EChequeRegisteration();        
        
        instance.setBankName(x);
        y = instance.getBankName();
        
        assertEquals(x, y);
    }

    /**
     * Test of setBankAddress method, of class EChequeRegisteration.
     */
    @Test
    public void testSetBankAddress() {
        System.out.println("setBankAddress");
        String x = "testSetaccountholder";
        String y = "";
        EChequeRegisteration instance = new EChequeRegisteration();        
        
        instance.setBankAddress(x);
        y = instance.getBankAddress();
        
        assertEquals(x, y);
    }

    /**
     * Test of setAccountNumber method, of class EChequeRegisteration.
     */
    @Test
    public void testSetAccountNumber() {
        System.out.println("setAccountNumber");
        String x = "testSetaccountholder";
        String y = "";
        EChequeRegisteration instance = new EChequeRegisteration();        
        
        instance.setAccountNumber(x);
        y = instance.getAccountNumber();
        
        assertEquals(x, y);
    }

    /**
     * Test of setClientName method, of class EChequeRegisteration.
     */
    @Test
    public void testSetClientName() {
        System.out.println("setClientName");
        String x = "testSetaccountholder";
        String y = "";
        EChequeRegisteration instance = new EChequeRegisteration();        
        
        instance.setClientName(x);
        y = instance.getClientName();
        
        assertEquals(x, y);
    }

    /**
     * Test of setEWalletLoaction method, of class EChequeRegisteration.
     */
    @Test
    public void testSetEWalletLoaction() {
        System.out.println("setEWalletLoaction");
        String x = "testSetaccountholder";
        String y = "";
        EChequeRegisteration instance = new EChequeRegisteration();        
        
        instance.setEWalletLoaction(x);
        y = instance.getEWalletLoaction();
        
        assertEquals(x, y);
    }

    /**
     * Test of setUsername method, of class EChequeRegisteration.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        int x = 32140;
        int y = 0;
        EChequeRegisteration instance = new EChequeRegisteration();        
        
        instance.setUsername(x);
        y = instance.getUsername();
        
        assertEquals(x, y);
    }

    /**
     * Test of setPasword method, of class EChequeRegisteration.
     */
    @Test
    public void testSetPasword() {
        System.out.println("setPasword");
        int x = 32140;
        int y = 0;
        EChequeRegisteration instance = new EChequeRegisteration();        
        
        instance.setPasword(x);
        y = instance.getPasword();
        
        assertEquals(x, y);
    }
}
