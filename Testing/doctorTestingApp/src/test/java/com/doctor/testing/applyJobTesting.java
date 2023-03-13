package com.doctor.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class applyJobTesting {
  
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/applyJob";

	@Test
	public void login() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"P:\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		//webdriver.findElement(By.id("btnk1")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("name")).sendKeys("raj");
		webdriver.findElement(By.id("age")).sendKeys("35");
		webdriver.findElement(By.id("emid")).sendKeys("Raj@gmail.com");
		webdriver.findElement(By.id("ph")).sendKeys("9087654321");
		webdriver.findElement(By.id("add")).sendKeys("chennai");
		webdriver.findElement(By.id("spe")).sendKeys("ortho");
		
		WebElement radio1 = webdriver.findElement(By.id("m"));
		WebElement radio2 = webdriver.findElement(By.id("f"));
		radio1.click();
		takeScreenshoot(webdriver,"ApplyJobTest");
		webdriver.findElement(By.id("aj")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("search tested successfully");
	}
	public static void takeScreenshoot(WebDriver webdriver,String fileName) throws IOException {
		//take the screen shot and store it as a file format
		File file=((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//now copy the the screen shot to the location
		org.apache.commons.io.FileUtils.copyFile(file,new File("P:\\Screenshots\\"+fileName+".png"));

  }
}

