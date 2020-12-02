package com.testng;

import org.testng.annotations.Test;

public class Prioritydemo {
	@Test(priority=2)
	  public void testcase1() {
		 System.out.println("this is testcase1");
	  }
	 @Test(priority=1)
	  public void testcase2() {
		 System.out.println("this is testcase2");
	  }
	 @Test(priority=3)
	  public void testcase3() {
		 System.out.println("this is testcase3");
	  }


}
