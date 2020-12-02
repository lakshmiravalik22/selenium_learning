package com.testng;

import org.testng.annotations.Test;

public class Parallelexecution {
	@Test(priority=2)
	  public void testcase4() {
		 System.out.println("this is testcase4");
	  }
	 @Test(priority=1)
	  public void testcase5() {
		 System.out.println("this is testcase5");
	  }
	 @Test(priority=3)
	  public void testcase6() {
		 System.out.println("this is testcase6");
	  }



}
