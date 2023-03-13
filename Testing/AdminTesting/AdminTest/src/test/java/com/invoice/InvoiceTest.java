package com.invoice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvoiceTest {
	 @Test
	  public void saveInvoiceDetails() {
		  wd.get("http://localhost:4200/admin-dashboard/create-invoice");  
		  wd.manage().window().maximize();
		   // wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		    
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    WebElement textFiledRef = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[1]/input"));
		    textFiledRef.sendKeys("ravi");
		    WebElement textFiledRef1 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[2]/input"));
		    textFiledRef1.sendKeys("22-01-2006");
		    WebElement textFiledRef2 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[3]/input"));
		    textFiledRef2.sendKeys("dengue");
		    WebElement textFiledRef3= wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[4]/input"));
		    textFiledRef3.sendKeys("500");
		    WebElement textFiledRef4 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[5]/input"));
		    textFiledRef4.sendKeys("700");
		    WebElement textFiledRef5 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[6]/input"));
		    textFiledRef5.sendKeys("200");
		    WebElement textFiledRef6 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[7]/input"));
		    textFiledRef6.sendKeys("6-7,gandinagar");
		    WebElement textFiledRef7 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[8]/input"));
		    textFiledRef7.sendKeys("986574123");
		    WebElement textFiledRef8 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[9]/input"));
		    textFiledRef8.sendKeys("26-02-2006");
		    WebElement textFiledRef9 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[10]/input"));
		    textFiledRef9.sendKeys("200");
		    try {
				takeScreenshoot(wd,"InvoiceScreenshot");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    WebElement submitButtonRef = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-create-invoice/div/div/div[2]/div/form/div[11]/input"));
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
