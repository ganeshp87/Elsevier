package com.elsevier.qe.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.elsevier.qe.util.TestUtil;
import java.io.File;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(getFilePath());
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	   

	public static String getFilePath(){
           return new StringBuffer(System.getProperty("user.dir")).
		      append(File.separator).append("src").append(File.separator).
		      append("test").append(File.separator).append("resources").append(File.separator).
		      append("com").append(File.separator).append("elsevier").append(File.separator).
		      append("qe").append(File.separator).append("environment").append(File.separator).
		      append("config.properties").toString();
	         }
	
	 public static void clickOn(WebDriver driver,WebElement element, int timeout){
			new WebDriverWait(driver,timeout).
			until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
	 public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value){
			new WebDriverWait(driver,timeout).
			until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		}

	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
}
