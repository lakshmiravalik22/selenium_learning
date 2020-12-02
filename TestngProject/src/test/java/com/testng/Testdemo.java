package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testdemo {
	 @Test
	  public void testcase1() {
		 System.out.println("this is testcase1");
	  }
	 @Test
	  public void testcase2() {
		 System.out.println("this is testcase2");
	  }
	 @Test
	  public void testcase3() {
		 System.out.println("this is testcase3");
	  }

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("before method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("after method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("after suite");
	  }

}
