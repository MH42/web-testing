package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import pageObjects.CreateUser;
import pageObjects.RecoverLDState;

public class TestRunner {

   public static void main(String[] args) throws Exception {
	   // Reset Logical Doc State
	   RecoverLDState recover = new RecoverLDState();
	   recover.main(null);
	   
	   //Create User
//	   CreateUser create = new CreateUser();
//	   create.register("userX", "u@v.de", "Sir", "Useful", "password");
	   
	   
	   //Login Test
	      Result login = JUnitCore.runClasses(LoginTest.class);
	      for (Failure failure : login.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(login.wasSuccessful());
	   // Search
	      Result search = JUnitCore.runClasses(SearchTest.class);
	      for (Failure failure : search.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(login.wasSuccessful());
	      
	      
	   //Language Test
      Result lang = JUnitCore.runClasses(LanguageTest.class);
      for (Failure failure : lang.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(lang.wasSuccessful());
      
      
      
   }
//   Trying to run tests in a runTest("Testname"); schema
//   public <T extends Result> void runTest(Class<T> run){
//	      T test = JUnitCore.runClasses(run.class);
//	      for (Failure failure : test.getFailures()) {
//	         System.out.println(failure.toString());
//	      }
//	      System.out.println(test.wasSuccessful());
//   }
   
}  