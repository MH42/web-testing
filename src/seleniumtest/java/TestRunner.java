import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

   public static void main(String[] args) {
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
   
   
}  