package com.abc.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Aravinda\\eclipse-workspace\\com.java.training\\DataDrivenFramework\\src\\com\\abc\\utilities\\DataDriven.properties");
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("email"));
		System.out.println(p.getProperty("pass"));
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(p.getProperty("email"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("pass"));
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();

	}

}
