package Utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AppUtils {
  @Test
  public void f() {
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
