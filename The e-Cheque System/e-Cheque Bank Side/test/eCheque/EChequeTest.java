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
public class EChequeTest {
    
    public EChequeTest() {
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
     * Test of setaccountholder method, of class ECheque.
     */
    @Test
    public void testSetaccountholder() {
        System.out.println("Setaccountholder");
        String x = "testSetaccountholder";
        String y = "";
        ECheque instance = new ECheque();        
        
        instance.setaccountholder(x);
        y = instance.getaccountholder();
        
        assertEquals(x, y);
    }

    /**
     * Test of setaccountNumber method, of class ECheque.
     */
    @Test
    public void testSetaccountNumber() {
        System.out.println("SetaccountNumber");
        String x = "testSetaccountNumber";
        String y = "";
        ECheque instance = new ECheque();        
        
        instance.setaccountNumber(x);
        y = instance.getaccountNumber();
        
        assertEquals(x, y);
    }

    /**
     * Test of setbankname method, of class ECheque.
     */
    @Test
    public void testSetbankname() {
        System.out.println("setbankname");
        String x = "testSetbankname";
        String y = "";
        ECheque instance = new ECheque();        
        
        instance.setbankname(x);
        y = instance.getbankname();
        
        assertEquals(x, y);
    }

    /**
     * Test of setpayToOrderOf method, of class ECheque.
     */
    @Test
    public void testSetpayToOrderOf() {
        System.out.println("setpayToOrderOf");
        String x = "testSetpayToOrderOf";
        String y = "";
        ECheque instance = new ECheque();        
        
        instance.setpayToOrderOf(x);
        y = instance.getpayToOrderOf();
        
        assertEquals(x, y);
    }

    /**
     * Test of setamountofMony method, of class ECheque.
     */
    @Test
    public void testSetamountofMony() {
        System.out.println("setamountofMony");
        String x = "testSetamountofMony";
        String y = "";
        ECheque instance = new ECheque();        
        
        instance.setamountofMony(x);
        y = instance.getMoney();
        
        assertEquals(x, y);       
    }

    /**
     * Test of setcurrencytype method, of class ECheque.
     */
    @Test
    public void testSetcurrencytype() {
        System.out.println("setcurrencytype");
        String y = "";
        String x = "testSetcurrencytype";        
        ECheque instance = new ECheque();        
        
        instance.setcurrencytype(x);
        y = instance.getcurrencytype();
        
        assertEquals(x, y);
    }

    /**
     * Test of setchequeNumber method, of class ECheque.
     */
    @Test
    public void testSetchequeNumber() {
        System.out.println("setchequeNumber");
        String y = "";
        String x = "testSetchequeNumber";        
        ECheque instance = new ECheque();        
        
        instance.setchequeNumber(x);
        y = instance.getchequeNumber();
        
        assertEquals(x, y);
    }

    /**
     * Test of setguaranteed method, of class ECheque.
     */
    @Test
    public void testSetguaranteed() {
        System.out.println("setguaranteed");
        boolean y = false;       
        ECheque instance = new ECheque();        
        
        instance.setguaranteed(true);
        y = instance.getguaranteed();
        
        assertEquals(true, y);
    }

    /**
     * Test of setearnday method, of class ECheque.
     */
    @Test
    public void testSetearnday() {
        System.out.println("setearnday");
        String y = "";
        String x = "testSetearnday";        
        ECheque instance = new ECheque();        
        
        instance.setearnday(x);
        y = instance.getearnday();
        
        assertEquals(x, y);
    }

    /**
     * Test of setbanksignature method, of class ECheque.
     */
    @Test
    public void testSetbanksignature() {
        System.out.println("setbanksignature");
        byte[] x = new byte[100];
        x[1] = (byte)0xe1;
        byte[] y = null;       
        ECheque instance = new ECheque();        
        
        instance.setbanksignature(x);
        y = instance.getbanksignature();
        
        assertEquals(x, y);
    }

    /**
     * Test of setdrawersiganure method, of class ECheque.
     */
    @Test
    public void testSetdrawersiganure() {
        System.out.println("setdrawersiganure");
        byte[] x = new byte[100];
        x[1] = (byte)0xe2;
        byte[] y = null;       
        ECheque instance = new ECheque();        
        
        instance.setdrawersiganure(x);
        y = instance.getdrawersiganure();
        
        assertEquals(x, y);
    }   
}
