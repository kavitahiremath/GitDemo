package Utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MobileTesting {
	  @Test
	  public void mob1() {
		  System.out.println("First method");
		  System.out.println("Second method");
		  System.out.println("Third method");
		  System.out.println("Fourth method");
		  System.out.println("Fifth method");
	  }
	  @Test
	  public void mob2() {
		  System.out.println("First method");
		  System.out.println("Second method");
		  System.out.println("Third method");
		  System.out.println("Fourth method");
		  System.out.println("Fifth method");
	  }
	  @Test
	  public void mob3() {
		  System.out.println("First method");
		  System.out.println("Second method");
		  System.out.println("Third method");
		  System.out.println("Fourth method");
		  System.out.println("Fifth method");
	  }
	  @Test
	  public void mob4() {
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
