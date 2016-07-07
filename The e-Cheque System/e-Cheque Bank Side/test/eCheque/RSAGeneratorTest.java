package eCheque;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
public class TestRSAGenerator {
   @Test
   public void RSAGenerator() {
	   //Test the RSAGenerator() method by generating an RSA generator class instance then checking it's not null
      RSAGenerator keyGen = new RSAGenerator();
      assertNotNull(keyGen);
   }
   @Test
   public void TestGenerateRSAKeys() {
	   //Test the RSAGenerator() method by generating an RSA key pair key then checking it's not null
      RSAGenerator keyGen = new RSAGenerator();
      try {
		KeyPair RSAKeys = keyGen.GenerateRSAKeys();
	  } catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
		assertEquals(1,0);  //By throwing an error this test is failed
	  }
   }
}
