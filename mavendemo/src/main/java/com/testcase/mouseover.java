package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();  
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriverManager.
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 30 seconds.
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 30 seconds.
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		System.out.println(driver.getTitle());
	}

}
