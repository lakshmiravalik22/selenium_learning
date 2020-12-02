package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependonmethoddemo {
	@Test
	  public void testcase4() {
		 System.out.println("this is testcase4");
	  }
	 @Test(dependsOnMethods="testcase4")
	  public void testcase5() {
		 System.out.println("this is testcase5");
		 Assert.assertTrue(false);
	  }
	 @Test(dependsOnMethods="testcase5")
	  public void testcase6() {
		 System.out.println("this is testcase6");
}
}
