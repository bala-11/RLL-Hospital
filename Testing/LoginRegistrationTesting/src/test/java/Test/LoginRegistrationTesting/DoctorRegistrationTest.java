package Test.LoginRegistrationTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DoctorRegistrationTest {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/signUp";

	@Test
	public void login() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"P:\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-signup/div/div/div[2]/div[1]/form/div[1]/input")).sendKeys("Raj@gmail.com");
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-signup/div/div/div[2]/div[1]/form/div[3]/input")).sendKeys("raj123");
		WebElement radio1 = webdriver.findElement(By.xpath("/html/body/app-root/div/app-signup/div/div/div[2]/div[1]/form/input[1]"));
		radio1.click();
		
		
		takeScreenshoot(webdriver,"Doctor Registration");
		webdriver.findElement(By.id("signup")).click();

		System.out.println("search tested successfully");
	}
	public static void takeScreenshoot(WebDriver webdriver,String fileName) throws IOException {
		//take the screen shot and store it as a file format
		File file=((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//now copy the the screen shot to the location
		org.apache.commons.io.FileUtils.copyFile(file,new File("P:\\Screenshots\\"+fileName+".png"));
	}
}