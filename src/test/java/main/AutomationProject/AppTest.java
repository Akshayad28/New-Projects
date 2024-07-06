package main.AutomationProject;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends App
{

		App a = new App();
		
		
		@BeforeTest
	    public void Launching() {
	    	
	    	a.setUp();
	        
	    }

	    
		@Test(priority=1)
	    public void Login() throws InterruptedException {
	    	
	    	a.testLogin();
	       
	    }

		@Test(priority=2)
	    public void verification() throws InterruptedException {
	    	a.testSomeOtherFunctionality();
	      
	    }

	    @AfterTest
	    public void End() throws InterruptedException {
	    	
	    	a.tearDown();
	      
	    }

	  



}
