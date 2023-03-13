package com.doctor.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class doctorTesting {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/doctor/getid";

	@Test
	public void viewId() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"P:\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		//webdriver.manage().window().maximize();
		
		webdriver.findElement(By.id("user")).sendKeys("1");
		takeScreenshoot(webdriver,"Doctor-SaveId");
		webdriver.findElement(By.id("save")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("vapp")).click();
		takeScreenshoot(webdriver,"Doctor-viewAppoinments");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("vpt")).click();
		takeScreenshoot(webdriver,"Doctor-Patients");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("dpt")).click();
		takeScreenshoot(webdriver,"Doctor-Disscharge Patients");
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
