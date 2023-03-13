package com.patient;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class patientTest {
	@Test
	  public void savePatientDetails() throws IOException {
		  wd.get("http://localhost:4200/admin-dashboard/AddPatient");  
		  wd.manage().window().maximize();
		   // wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		    
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    WebElement textFiledRef = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/div[1]/input"));
		    textFiledRef.sendKeys("ram");
		    WebElement textFiledRef1 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/div[2]/input"));
		    textFiledRef1.sendKeys("21");
		   
		    WebElement textFiledRef3= wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/div[3]/input"));
		    textFiledRef3.sendKeys("9865743298");
		    WebElement textFiledRef4 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/div[5]/input"));
		    textFiledRef4.sendKeys("9-10,shivajinagar");
		    WebElement textFiledRef5 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/div[4]/input"));
		    textFiledRef5.sendKeys("ram@gmail.com");
		    WebElement textFiledRef6 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/div[6]/input"));
		    textFiledRef6.sendKeys("fever,cold");
		    WebElement textFiledRef2 = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/input[1]"));
		    textFiledRef2.click();
		    takeScreenshoot(wd,"PatientTest");
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    WebElement submitButtonRef = wd.findElement(By.xpath("/html/body/app-root/div/app-admin-dashboard/app-addpatient/div/div/div[2]/div/form/div[7]/input"));
		    submitButtonRef.click();
	  } public static void takeScreenshoot(WebDriver wd,String fileName) throws IOException {
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
