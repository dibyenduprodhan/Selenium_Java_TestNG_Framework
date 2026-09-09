package BaseTestcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ConfigReader;

public class BaseTest {
	public WebDriver driver;
	//ref variable of ConfigReader class
	protected ConfigReader config;
	@BeforeClass
	public void setup() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//create object of config reader class
		config=new ConfigReader();
		//call pageurl method using ref
		driver.get(config.pageUrl());
		
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
