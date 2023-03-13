package com.admin;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class adminTesting {
  @Test
  public void saveDoctorDetails() throws IOException {
	  wd.get("http://localhost:4200/admin-dashboard/AddDoctor");  
	  wd.manage().window();
	   // wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    WebElement textFiledRef = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[1]/input"));
	    textFiledRef.sendKeys("6");
	    WebElement textFiledRef1 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[2]/input"));
	    textFiledRef1.sendKeys("nikhil");
	    WebElement textFiledRef2 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[3]/input"));
	    textFiledRef2.sendKeys("21");
	    WebElement textFiledRef4 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[5]/input"));
	    textFiledRef4.sendKeys("pending");
	    WebElement textFiledRef5 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[8]/input"));
	    textFiledRef5.sendKeys("ortho");
	    WebElement textFiledRef6 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[4]/input"));
	    textFiledRef6.sendKeys("9876543210");
	    WebElement textFiledRef7 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[6]/input"));
	    textFiledRef7.sendKeys("nikhil@gmail.com");
	    WebElement textFiledRef8 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[7]/input"));
	    textFiledRef8.sendKeys("6-7,gandinagar");
	    WebElement textFiledRef3= wd.findElement(By.xpath("//*[@id=\"m\"]"));
	    textFiledRef3.click();
	    try {
			takeScreenshoot(wd,"AdminTest");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    WebElement submitButtonRef = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-adddoctor/div/div/div[2]/div/form/div[9]/input"));
	    submitButtonRef.click();
	    
  }
  
  public static void takeScreenshoot(WebDriver wd,String fileName) throws IOException {
		//take the screen shot and store it as a file format
		File file=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//now copy the the screen shot to the location
		org.apache.commons.io.FileUtils.copyFile(file,new File("P:\\Screenshots\\"+fileName+".png"));
	}
  
  
  WebDriver wd;
  
  @BeforeMethod
  public void beforeMethod() {
  	  System.setProperty("webdriver.chrome.driver", "P:\\chromedriver.exe");
  		
  		 wd = new ChromeDriver();
  		 
  		
  }

  @AfterMethod
  public void afterMethod() {
  }

  }

