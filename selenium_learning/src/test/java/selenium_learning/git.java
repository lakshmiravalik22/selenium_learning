package selenium_learning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();
driver.findElement(By.xpath("//html/body")).click();



	}

}
