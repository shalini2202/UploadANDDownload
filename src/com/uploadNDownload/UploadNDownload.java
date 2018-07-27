package com.uploadNDownload;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class UploadNDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		/*//uploading
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@class='upload_txt']"));
		
		element.sendKeys("C:\\Users\\a631020\\eclipse-workspace\\UploadNDownload\\src\\com\\uploadNDownload\\upload.txt");
		//element.sendKeys("C:\\Users\\a631020\\Desktop\\om.txt");
		
		driver.findElement(By.xpath("//input[@class='field_check']"));
		
		driver.findElement(By.xpath("//button[@class='btn buttoncolor has-spinner']")).click();
		
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.xpath(".//*[@id='res']/center")).getText();
		System.out.println(actual);
		
		Assert.assertTrue(actual.toLowerCase().contains("1 file"));
		System.out.println("File uploaded successfully!!");
		
	    driver.quit();
		*/

		
		//downloading
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	}

}
