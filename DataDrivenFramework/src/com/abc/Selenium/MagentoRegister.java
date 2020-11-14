package com.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MagentoRegister {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("HTTPS://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@id=\"register\"]/span")).click();
		driver.findElement(By.id("firstname")).sendKeys("usha");
		driver.findElement(By.id("lastname")).sendKeys("r");
		driver.findElement(By.id("email_address")).sendKeys("dhara19892020@gmail.com");;
		WebElement element = driver.findElement(By.id("company_type"));
		Select select = new Select(element);
		select.selectByIndex(1);
		WebElement element2 = driver.findElement(By.id("individual_role"));
		Select select1 = new Select(element2);
		select1.selectByIndex(1);
		WebElement element3 = driver.findElement(By.id("country"));
		Select select2 = new Select(element3);
		select2.selectByIndex(1);
		driver.findElement(By.id("password")).sendKeys("Corona2020123*");
		driver.findElement(By.id("password-confirmation")).sendKeys("Corona2020123*");
		/**Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();
		Thread.sleep(4000);**/
		driver.findElement(By.id("agree_terms")).click();
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span"));


	}

}
