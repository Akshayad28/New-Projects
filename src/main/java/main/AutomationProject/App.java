package main.AutomationProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CraftMethods.CraftDrivers;
import XPathLiabrary.Xpaths;

public class App {
    private WebDriver Codriver;
    private CraftDrivers driver;

    // Constructor to initialize the driver
    public App() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\githubdemo\\Drivers\\chromedriver.exe");
        // Initialize ChromeDriver and CraftDrivers
        Codriver = new ChromeDriver();
        driver = new CraftDrivers(Codriver);
    }

    // Before every test method, launch browser and perform setup
   
    public void setUp() {
        System.out.println("Launching browser...");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demo.guru99.com/V4/index.php");
        driver.takeCustomScreenshot();
    }

    
    public void testLogin() throws InterruptedException {
        System.out.println("Logging in...");
        driver.findElement(Xpaths.EmailID).sendKeys("mngr580138");
        Thread.sleep(1000);
        driver.findElement(Xpaths.Password).sendKeys("YzydyrY");
        Thread.sleep(1000);
        driver.takeCustomScreenshot();
        driver.findElement(Xpaths.Submit).click();
    }

  
    public void testSomeOtherFunctionality() {
        System.out.println("Performing some other functionality...");
        // Example test code
    }

    // After every test method, close the browser and perform cleanup
   
    public void tearDown() throws InterruptedException {
        System.out.println("Closing browser...");
        driver.takeCustomScreenshot();
        Thread.sleep(2000);
        driver.quit();
    }
}
