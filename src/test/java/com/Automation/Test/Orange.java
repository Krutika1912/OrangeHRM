package com.Automation.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Automation.GenericUtils.ExcelData;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String Username=ExcelData.getdata("C:\\Users\\krutika.shukla\\Downloads\\Orange.xlsx", "Orange", 0, 0);
		String Password=ExcelData.getdata("C:\\Users\\krutika.shukla\\Downloads\\Orange.xlsx", "Orange", 0, 1);
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krutika.shukla\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver(); 
		  
		driver.get("https://opensource-demo.orangehrmlive.com/");  
		
		WebElement element =driver.findElement(By.id("txtUsername"));
		element.sendKeys(Username);
		
		WebElement element1 =driver.findElement(By.id("txtPassword"));
		element1.sendKeys(Password);
		driver.findElement(By.name("Submit")).click();
		
		
		
	}

}
