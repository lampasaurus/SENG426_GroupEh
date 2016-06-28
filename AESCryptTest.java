package eCheque;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;

public class TestAESCrypt {
   @Test
   public void TestGenerateRandomAESKey() {	      
	      AESCrypt aesKey128 = new AESCrypt();
          try {
			Key sessionKey = aesKey128.GenerateRandomAESKey();
		  } catch (Exception e) {
			e.printStackTrace();
			assertEquals(1,0);  //By throwing an error this test is failed
		  }
   }
   @Test
   public void TestinitializeCipher() {
	      String str= "initializeCipher still needs to be done";
	      assertEquals("initializeCipher still needs to be done",str);
   }
   @Test
   public void Testcrypt() {
	      String str= "Crypt still needs to be done";
	      assertEquals("Crypt still needs to be done",str);
   }
   @Test
   public void TestinilizeAESKeyByPassword() {
	   
	      //Test password is 'password'
	      String passTemp="password";
	      
	      //Run the method to generate an AES key from 'password'
	      AESCrypt aesCrypt = new AESCrypt();
          Key MethodKey = aesCrypt.inilizeAESKeyByPassword(passTemp);
          
          //Generate by hand an AES key from the plaintext 'password'
          byte[] KeyData =passTemp.getBytes();
          SecretKeySpec TestKey;
          TestKey =new SecretKeySpec(KeyData,"AES");
          Key Test = TestKey;

          //Compare the two results to ensure the method is working correctly
          assertEquals(Test, MethodKey);
   }
}
