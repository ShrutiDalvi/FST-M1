package net.training_support.FST15_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new FirefoxDriver();
		        driver.get("https://www.google.com");
		        Thread.sleep(1000);
		        driver.close();
		   

	}

}
