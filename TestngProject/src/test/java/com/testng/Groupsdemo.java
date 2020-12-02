package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groupsdemo {
	@Test(groups= {"smoketesting","regression testing"})
	  public void testcase4() {
		 System.out.println("this is testcase4");
	  }
	 @Test(groups= {"smoketesting","re testing"})
	  public void testcase5() {
		 System.out.println("this is testcase5");
		 Assert.assertTrue(false);
	  }
	 @Test(groups= {"functionaltesting","sanity testing"})
	  public void testcase6() {
		 System.out.println("this is testcase6");
}

}
