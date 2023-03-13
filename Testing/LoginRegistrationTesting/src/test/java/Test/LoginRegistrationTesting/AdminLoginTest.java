package Test.LoginRegistrationTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/admin-login";

	@Test
	public void login() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"P:\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-admin-login/html/body/form/div/div/div[2]/div[1]/div[1]/div/input")).sendKeys("admin_2@gmail.com");
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-admin-login/html/body/form/div/div/div[2]/div[1]/div[2]/div/input")).sendKeys("admin_02");
		
		takeScreenshoot(webdriver,"AdminLoginTest");
			
		webdriver.findElement(By.id("login")).click();
	
		System.out.println("search tested successfully");
	}
	 public static void takeScreenshoot(WebDriver webdriver,String fileName) throws IOException {
			//take the screen shot and store it as a file format
			File file=((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
			//now copy the the screen shot to the location
			org.apache.commons.io.FileUtils.copyFile(file,new File("P:\\Screenshots\\"+fileName+".png"));

}
}