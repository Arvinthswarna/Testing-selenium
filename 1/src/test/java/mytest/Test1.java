package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test1 {
  @Test
  public void f() {
	  System.err.println("hello chennai");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.err.println("hello bangalore");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("welcome here");
  }

}
