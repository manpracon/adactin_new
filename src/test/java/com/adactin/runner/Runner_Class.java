package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Manoj\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
					 glue = "com.adactin.stepdefinition",
					 monochrome = false ,
					 dryRun = false,
					 strict = true,
					 plugin = {"html:Reports/Html_Report1",
							 	"pretty",
							 	"json:Reports/Json_Report1.json",
							 	"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report1.html"
					 })

public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void myRunner() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj\\eclipse-workspace\\AdactinCucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void end_Task() {
		driver.close();
	}
}