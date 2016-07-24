/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Chris
 */
public class EChequeIOTest {
	   @Test
	   public void Testsavecheque() {
		   //Test the savecheque(ECheque obj,String filename) method by saving a check, then confirming it was saved
		   
		   //Construct and save cheque
           EChequeIO drawCheque = new EChequeIO();
           ECheque chequeObj = new ECheque();
           chequeObj.setaccountNumber("#YOLOSWAG420");
           chequeObj.setaccountholder("Christopher Life");
           chequeObj.setbankname("HSBC");
           chequeObj.setchequeNumber("123456789");
           chequeObj.setamountofMony("69");
           chequeObj.setcurrencytype("US $");
           chequeObj.setearnday("2016,07,24");
           chequeObj.setpayToOrderOf("Donald Trump");
           chequeObj.setguaranteed(true);
           try {
			drawCheque.savecheque(chequeObj,"\\My Cheques\\"+chequeObj.getchequeNumber()+".sec");
           } catch (IOException e) {
			assertEquals(0,1);
           }
           
           // Check if the file exists, then close the file
           try {
			InputStream in = new FileInputStream("\\My Cheques\\"+chequeObj.getchequeNumber()+".sec");
			assertNotNull(in);
   	        in.close();
           } catch (IOException e) {
   			assertEquals(0,1);
           }	
           

	   }
	   @Test
	   public void Testreadcheque() {
		   //Test the readcheque(String filename) method by ....
		   
		 //Construct and save cheque
           EChequeIO drawCheque = new EChequeIO();
           ECheque wCheque = new ECheque();
           wCheque.setaccountNumber("#YOLOSWAG420");
           wCheque.setaccountholder("Christopher Life");
           wCheque.setbankname("HSBC");
           wCheque.setchequeNumber("123456789");
           wCheque.setamountofMony("69");
           wCheque.setcurrencytype("US $");
           wCheque.setearnday("2016,07,24");
           wCheque.setpayToOrderOf("Donald Trump");
           wCheque.setguaranteed(true);
           try {
			drawCheque.savecheque(wCheque,"\\My Cheques\\"+wCheque.getchequeNumber()+".sec");
           } catch (IOException e) {
			assertEquals(0,1);
           }
           //Read the same cheque to verify data
	       EChequeIO loadCheq = new EChequeIO();
	       try {
			ECheque rCheque = loadCheq.readcheque("\\My Cheques\\"+wCheque.getchequeNumber()+".sec");
	        assertEquals(wCheque.getMoney(), rCheque.getMoney());
	        assertEquals(wCheque.getaccountholder(), rCheque.getaccountholder());
	        assertEquals(wCheque.getaccountNumber(), rCheque.getaccountNumber());
	        assertEquals(wCheque.getbankname(), rCheque.getbankname());
	        assertEquals(wCheque.getpayToOrderOf(), rCheque.getpayToOrderOf());
	        assertEquals(wCheque.getcurrencytype(), rCheque.getcurrencytype());
	        assertEquals(wCheque.getchequeNumber(), rCheque.getchequeNumber());
	        assertEquals(wCheque.getguaranteed(), rCheque.getguaranteed());
	        assertEquals(wCheque.getearnday(), rCheque.getearnday());
	       } catch (ClassNotFoundException | IOException e) {
				assertEquals(0,1);
	       }
	   }  
	   @Test
	   public void TestEChequeIO() {
		   //Test the EChequeIO() constructor by constructing an EChequeIO object and checking null
		   EChequeIO cheque = new EChequeIO();
		   assertNotNull(cheque);
	   }
}
