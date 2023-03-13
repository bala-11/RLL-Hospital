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

public class PatientLoginTest {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/login";

	@Test
	public void login() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"P:\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		//webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div[2]/div[1]/form/div[1]/input")).sendKeys("Akash@gmail");
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div[2]/div[1]/form/div[2]/input")).sendKeys("akash123");
		WebElement radio1 = webdriver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div[2]/div[1]/form/input[2]"));
		radio1.click();
		takeScreenshoot(webdriver,"Patient Login");
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div[2]/div[1]/form/div[3]/input")).click();

		System.out.println("search tested successfully");
	}
	public static void takeScreenshoot(WebDriver webdriver,String fileName) throws IOException {
		//take the screen shot and store it as a file format
		File file=((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		//now copy the the screen shot to the location
		org.apache.commons.io.FileUtils.copyFile(file,new File("P:\\Screenshots\\"+fileName+".png"));
	}
}