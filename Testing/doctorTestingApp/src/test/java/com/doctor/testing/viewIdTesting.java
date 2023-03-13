package com.doctor.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class viewIdTesting {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/viewId";

	@Test
	public void viewId() {
		System.setProperty("webdriver.chrome.driver",
				"P:\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.id("btnk2")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		webdriver.findElement(By.id("em")).sendKeys("doctor1@gmail.com");
		webdriver.findElement(By.id("id")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("search tested successfully");
	}

}
