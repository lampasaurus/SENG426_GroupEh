package eCheque;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.crypto.spec.SecretKeySpec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.*;
import javax.crypto.*;

public class TestAESCrypt {
   @Test
   public void TestGenerateRandomAESKey() {
	   //Test GenerateRandomAESKey() by generating an AES key and ensuring that an AES key was generated
	      AESCrypt aesKey128 = new AESCrypt();
          try {
			Key sessionKey = aesKey128.GenerateRandomAESKey();
			assertNotNull(sessionKey);
			assertEquals(sessionKey.getAlgorithm(),"AES");
		  } catch (Exception e) {
			e.printStackTrace();
			assertEquals(1,0);  //By throwing an error this test is failed
		  }
   }
   @Test
   public void TestinitializeCipherAES_DECRYPT() {
	   //Test initializeCipher() by initializing an AES cipher in decrypt mode then checking the parameters
	   	  //Why does in program padding of passwords reuse the password to pad?
	   	  //Generate AES key from password as 'AES128'
	      String passTemp="passwordpassword";
	      AESCrypt aesCrypt = new AESCrypt();
          Key AES128 = aesCrypt.inilizeAESKeyByPassword(passTemp);
          
          try {
  			//Initialize cipher in DECRYPT_MODE using method
  			Cipher cipher = aesCrypt.initializeCipher(AES128,1);
			assertNotNull(cipher);
			
			//Initialize cipher in WRAP_MODE using java library
			Cipher TestCipher = Cipher.getInstance("AES");
			TestCipher.init(Cipher.DECRYPT_MODE, AES128);
			
			assertEquals(TestCipher.getParameters(), cipher.getParameters());
			
          } catch (Exception e) {
			e.printStackTrace();
		    assertEquals(0,1);
          }
   }
   @Test
   public void TestinitializeCipherAES_ENCRYPT() {
	   //Test initializeCipher() by initializing an AES cipher in encrypt mode then checking the parameters
	   	  //Why does in program padding of passwords reuse the password to pad?
	   	  //Generate AES key from password as 'AES128'
	      String passTemp="passwordpassword";
	      AESCrypt aesCrypt = new AESCrypt();
          Key AES128 = aesCrypt.inilizeAESKeyByPassword(passTemp);
          
          try {
    		//Initialize cipher in DECRYPT_MODE using method
  			Cipher cipher = aesCrypt.initializeCipher(AES128,0);
			assertNotNull(cipher);
			
			//Initialize cipher in WRAP_MODE using java library
			Cipher TestCipher = Cipher.getInstance("AES");
			TestCipher.init(Cipher.ENCRYPT_MODE, AES128);
			
			assertEquals(TestCipher.getParameters(), cipher.getParameters());
			
          } catch (Exception e) {
			e.printStackTrace();
		    assertEquals(0,1);
          }
   }
   @Test
   public void TestinitializeCipherRSA_WRAP() {
	   //Test initializeCipher() by initializing an RSA cipher in wrap mode then checking the parameters
	      AESCrypt aesCrypt = new AESCrypt();
          
          KeyPairGenerator kpg;
          try {
            //Generate RSA key as 'RSAKey'
			kpg = KeyPairGenerator.getInstance("RSA");
			kpg.initialize(1024);
			KeyPair kp = kpg.genKeyPair();
			Key RSAKey = kp.getPublic();

			//Initialize cipher in WRAP_MODE using method
  			Cipher cipher = aesCrypt.initializeCipher(RSAKey,2);
			assertNotNull(cipher);

			//Initialize cipher in WRAP_MODE using java library
			Cipher TestCipher = Cipher.getInstance("RSA");
			TestCipher.init(Cipher.WRAP_MODE, RSAKey);
			
			assertEquals(TestCipher.getParameters(), cipher.getParameters());
			
          } catch (Exception e) {
			e.printStackTrace();
		    assertEquals(0,1);
          }
   }
   @Test
   public void TestinitializeCipherRSA_UNWRAP() {
	   //Test initializeCipher() by initializing an RSA cipher in unwrap mode then checking the parameters
	      AESCrypt aesCrypt = new AESCrypt();
          
          KeyPairGenerator kpg;
          try {
            //Generate RSA key as 'RSAKey'
			kpg = KeyPairGenerator.getInstance("RSA");
			kpg.initialize(1024);
			KeyPair kp = kpg.genKeyPair();
			Key RSAKey = kp.getPublic();

			//Initialize cipher in UNWRAP_MODE using method
			//#>2 initializes in UNWRAP_MODE - should have #==3 and error otherwise
  			Cipher cipher = aesCrypt.initializeCipher(RSAKey,3);
			assertNotNull(cipher);

			//Initialize cipher in UNWRAP_MODE using java library
			Cipher TestCipher = Cipher.getInstance("RSA");
			TestCipher.init(Cipher.UNWRAP_MODE, RSAKey);
			
			assertEquals(TestCipher.getParameters(), cipher.getParameters());
			
          } catch (Exception e) {
			e.printStackTrace();
		    assertEquals(0,1);
          }
   } 
   @Test
   public void Testcrypt() {
	   //Test the crypt() method by encrypting then decrypting a password and comparing the result
	      
	      String passTemp="passwordpassword";

          try {
        	  
        	//ENCRYPT        	  
        	ObjectOutputStream outObj; 
            // create the user digital certificate (digital identity)
            RSAGenerator keyGen = new RSAGenerator();
            KeyPair RSAKeys = keyGen.GenerateRSAKeys();
              
            // encrypt private key with user password. 
            outObj = new ObjectOutputStream(new FileOutputStream("\\Security Tools\\privateKey.key"));
            outObj.writeObject(RSAKeys.getPrivate());
            outObj.close();
            
        	//create AES Key with user password and cipher  
            AESCrypt aesCryptENCRYPT = new AESCrypt();
            Key AES128ENCRYPT = aesCryptENCRYPT.inilizeAESKeyByPassword(passTemp);
            Cipher encryptCipher = aesCryptENCRYPT.initializeCipher(AES128ENCRYPT,0);
            InputStream in = new FileInputStream("\\Security Tools\\privateKey.key");		//RSA Private key
            OutputStream out = new FileOutputStream("\\Security Tools\\Private Key.key");	//Ecrypted AES PW
              
            // encrypt the private key with the AES key and delete the plain key
            aesCryptENCRYPT.crypt(in,out,encryptCipher);
            in.close();
            out.close();
            
            //DECRYPT
            //create AES Key with user password and cipher  
            AESCrypt aesCryptDECRYPT = new AESCrypt();
            Key AES128DECRYPT = aesCryptDECRYPT.inilizeAESKeyByPassword(passTemp);
            Cipher decryptCipher = aesCryptDECRYPT.initializeCipher(AES128DECRYPT,1);
            in = new FileInputStream("\\Security Tools\\Private Key.key");					//Encrypted AES PW
            out = new FileOutputStream("\\Security Tools\\PrivateKeyPost.key");				//Out RSA key - should match RSA PKey from above
                      
            // decrypt the private key with the AES key and delete the plain key
            aesCryptDECRYPT.crypt(in,out,decryptCipher);
            in.close();
            out.close();
            
            //Test to ensure "\\Security Tools\\PrivateKeyPost.key" and "\\Security Tools\\PrivateKey.key" match
            File file1 = new File("\\Security Tools\\privateKey.key");
            File file2 = new File("\\Security Tools\\PrivateKeyPost.key");
            
            FileReader fR1 = new FileReader(file1);
            FileReader fR2 = new FileReader(file2);

            BufferedReader reader1 = new BufferedReader(fR1);
            BufferedReader reader2 = new BufferedReader(fR2);

            String line1 = null;
            String line2 = null;
            while (((line1 = reader1.readLine()) != null)
                    && ((line2 = reader2.readLine()) != null)) {
                if (!line1.equalsIgnoreCase(line2))
                    assertEquals(0,1);		//If the test gets here a mismatch has been found and the test fails
            }
            reader1.close();
            reader2.close();
            
          } catch (Exception e) {
        	  e.printStackTrace();
        	  assertEquals(0,1);
          }
   }
   @Test
   public void TestinilizeAESKeyByPassword() {
	   //Test the inilizeAESKeyByPassword() method by generating an AES key using the method, and
	   // generating the same key using the java crypto library, then comparing the two
	   
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
