package selenium_learning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2talogin1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
 driver.findElement(By.id("username")).sendKeys("lakshmi");
driver.findElement(By.id("password")).sendKeys("Admin@123");
driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[1]/label")).click();
driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();

}
}




