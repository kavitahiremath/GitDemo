package Utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AppUtils {
  @Test
  public void f() {
	  System.out.println("First method");
	  System.out.println("Second method");
	  System.out.println("Third method");
	  System.out.println("Fourth method");
	  System.out.println("Fifth method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Start Session");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is Close Session");
  }

}
