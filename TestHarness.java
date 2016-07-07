package eCheque;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
 	  System.out.println("JUnit test output for E-Cheque System");
	  //Instantiate result objects
	  //ONE RESULT OBJECT PER CLASS TO BE TESTED
	  Result resultRSAGenerator = JUnitCore.runClasses(TestRSAGenerator.class);
	  Result resultAESCrypt = JUnitCore.runClasses(TestAESCrypt.class);
	  
	  //Print out results
	  //ONE 'FOR' LOOP CHUNK PER TESTED CLASS
//RSAGenerator
      for (Failure failureRSAGenerator : resultRSAGenerator.getFailures()) {
          System.out.println(failureRSAGenerator.toString());
      }
      System.out.println("CLASS: RSAGenerator");
      System.out.println("  TESTS RUN: " + resultRSAGenerator.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultRSAGenerator.getRunCount()-resultRSAGenerator.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultRSAGenerator.getFailureCount());
      if(resultRSAGenerator.wasSuccessful()){
    	  System.out.println("  RESULT: SUCCESS");
      }
      else{
    	  System.out.println("  RESULT: FAILURE");
      }
      
//AESCrypt      
      for (Failure failureAESCrypt : resultAESCrypt.getFailures()) {
          System.out.println(failureAESCrypt.toString());
      }
      System.out.println("CLASS: AESCrypt");
      System.out.println("  TESTS RUN: " + resultAESCrypt.getRunCount());
      System.out.println("  TESTS PASSED: " + (resultAESCrypt.getRunCount()-resultAESCrypt.getFailureCount()));
      System.out.println("  TESTS FAILED: " + resultAESCrypt.getFailureCount());
      if(resultAESCrypt.wasSuccessful()){
    	  System.out.println("  RESULT: SUCCESS");
      }
      else{
    	  System.out.println("  RESULT: FAILURE");
      }
   }
}  	
