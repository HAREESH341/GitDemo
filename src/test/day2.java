package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeSuite
	public void bfsuite() {
		System.out.println("I am no-1");
	}
	
	@AfterSuite
	public void afsuite() {
		System.out.println("I am after all");
	}
	
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute last");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequsite() {
		System.out.println("I wii execute first");
	}

}
