package eCheque;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestHarnessClient {
   public static void main(String[] args) {
 	  System.out.println("JUnit test output for E-Cheque System - Client Side");
	  //Instantiate result objects
	  //ONE RESULT OBJECT PER CLASS TO BE TESTED
	  Result resultAESCrypt = JUnitCore.runClasses(AESCryptTest.class);
	  Result resultDigitalCertificateIO = JUnitCore.runClasses(DigitalCertificateIOTest.class);
	  Result resultDigitalCertificate = JUnitCore.runClasses(DigitalCertificateTest.class);
	  Result resultDigitalsigneture = JUnitCore.runClasses(DigitalsignetureTest.class);
	  Result resultEChequeIO = JUnitCore.runClasses(EChequeIOTest.class);
	  Result resultEChequeRegisteration = JUnitCore.runClasses(EChequeRegisterationTest.class);
	  Result resultECheque = JUnitCore.runClasses(EChequeTest.class);
	  Result resultRSAGenerator = JUnitCore.runClasses(RSAGeneratorTest.class);
	  
	  
	  //Print out results
	  //ONE 'FOR' LOOP CHUNK PER TESTED CLASS
//AESCrypt      
      for (Failure failureAESCrypt : resultAESCrypt.getFailures()) {System.out.println(failureAESCrypt.toString());}
      System.out.println("CLASS: AESCrypt");
      System.out.println("  TESTS RUN: " + resultAESCrypt.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultAESCrypt.getRunCount()-resultAESCrypt.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultAESCrypt.getFailureCount());
      if(resultAESCrypt.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}
   
//DigitalCertificateIO
      for (Failure failureDigitalCertificateIO : resultDigitalCertificateIO.getFailures()) {System.out.println(failureDigitalCertificateIO.toString());}
      System.out.println("CLASS: DigitalCertificateIO");
      System.out.println("  TESTS RUN: " + resultDigitalCertificateIO.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultDigitalCertificateIO.getRunCount()-resultDigitalCertificateIO.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultDigitalCertificateIO.getFailureCount());
      if(resultDigitalCertificateIO.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}
      
//DigitalCertificate
      for (Failure failureDigitalCertificate : resultDigitalCertificate.getFailures()) {System.out.println(failureDigitalCertificate.toString());}
      System.out.println("CLASS: DigitalCertificate");
      System.out.println("  TESTS RUN: " + resultDigitalCertificate.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultDigitalCertificate.getRunCount()-resultDigitalCertificate.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultDigitalCertificate.getFailureCount());
      if(resultDigitalCertificate.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}
      
//Digitalsigneture
      for (Failure failureDigitalsigneture : resultDigitalsigneture.getFailures()) {System.out.println(failureDigitalsigneture.toString());}
      System.out.println("CLASS: Digitalsigneture");
      System.out.println("  TESTS RUN: " + resultDigitalsigneture.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultDigitalsigneture.getRunCount()-resultDigitalsigneture.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultDigitalsigneture.getFailureCount());
      if(resultDigitalsigneture.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}
      
//EChequeIO
      for (Failure failureEChequeIO : resultEChequeIO.getFailures()) {System.out.println(failureEChequeIO.toString());}
      System.out.println("CLASS: EChequeIO");
      System.out.println("  TESTS RUN: " + resultEChequeIO.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultEChequeIO.getRunCount()-resultEChequeIO.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultEChequeIO.getFailureCount());
      if(resultEChequeIO.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}
      
//EChequeRegisteration
      for (Failure failureEChequeRegisteration : resultEChequeRegisteration.getFailures()) {System.out.println(failureEChequeRegisteration.toString());}
      System.out.println("CLASS: EEChequeRegisteration");
      System.out.println("  TESTS RUN: " + resultEChequeRegisteration.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultEChequeRegisteration.getRunCount()-resultEChequeRegisteration.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultEChequeRegisteration.getFailureCount());
      if(resultEChequeRegisteration.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}
      
//ECheque
      for (Failure failureECheque : resultECheque.getFailures()) {System.out.println(failureECheque.toString());}
      System.out.println("CLASS: EEChequeRegisteration");
      System.out.println("  TESTS RUN: " + resultECheque.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultECheque.getRunCount()-resultECheque.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultECheque.getFailureCount());
      if(resultECheque.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}

//RSAGenerator
      for (Failure failureRSAGenerator : resultRSAGenerator.getFailures()) {System.out.println(failureRSAGenerator.toString());}
      System.out.println("CLASS: RSAGenerator");
      System.out.println("  TESTS RUN: " + resultRSAGenerator.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultRSAGenerator.getRunCount()-resultRSAGenerator.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultRSAGenerator.getFailureCount());
      if(resultRSAGenerator.wasSuccessful()){System.out.println("  RESULT: SUCCESS");}
      else{System.out.println("  RESULT: FAILURE");}
	}
      
}
