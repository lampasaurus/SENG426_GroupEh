package eCheque;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
public class TestRSAGenerator {
   @Test
   public void RSAGenerator() {
      RSAGenerator keyGen = new RSAGenerator();
      assertNotNull(keyGen);
   }
   @Test
   public void TestGenerateRSAKeys() {
      RSAGenerator keyGen = new RSAGenerator();
      try {
		KeyPair RSAKeys = keyGen.GenerateRSAKeys();
	  } catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
		assertEquals(1,0);  //By throwing an error this test is failed
	  }
   }
}
