package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFrameWorkBasics {
	
	/*
	BeforeSuite---set up system property for chrome ---I
	BeforeTest---login --- II
	BeforeClass---chrome browserlaunch --- III
	
	BeforeMethod---enter url
	Test---google title test
	AfterMethod---logout from app
	
	BeforeMethod---enter url
	Test---search test
	AfterMethod---logout from app
	
	AfterClass---close browser
	AfterTest---deleteallthecookies
	
	PASSED: googletitletest
	PASSED: searchtest
	
    */
	
	// precondition annotations---starts with @Before
	@BeforeSuite//1
	public void setup(){
		System.out.println("BeforeSuite---set up system property for chrome");
	}
	
	@BeforeClass//3
	public void launchbrowser(){
		System.out.println("BeforeClass---chrome browserlaunch");	
	}
	
	/*
	 * 
	 * @before method
	 * @test-1
	 * @after method
	 * 
	 * @before method
	 * @test-2
	 * @after method
	 * 
	 * 
	 */
	
	@BeforeMethod//4
	public void enterUrl(){
		System.out.println("BeforeMethod---enter url");
		
	}
	
	@BeforeTest//2
	public void login(){
		System.out.println("BeforeTest---login");
	}
	
	//test cases ---starts with @test
	
	@Test//5
	public void googletitletest(){
		System.out.println("Test---google title test");
	}
	
	@Test
	public void searchtest(){
		System.out.println("Test---search test");
	}
	
	
	// post conditions---starts with @After
	
	@AfterMethod//6
	public void logout(){
		System.out.println("AfterMethod---logout from app");
	}
	
	@AfterTest//8
	public void deleteallthecookies(){
		System.out.println("AfterTest---deleteallthecookies");
	}
	
	@AfterClass//7
	public void closebrowser(){
		System.out.println("AfterClass---close browser");
		
	}
	
	
	
	
	
	
	}
