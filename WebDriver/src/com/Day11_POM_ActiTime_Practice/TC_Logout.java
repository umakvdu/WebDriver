package com.Day11_POM_ActiTime_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Logout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/umaheswararao/login.do");
		LoginPO li=new LoginPO(driver);
		li.LoginWithRemember("umakvdu", "umakvdu");
		LogOutPO lo=new LogOutPO(driver);
		lo.Logout();
		Thread.sleep(2000);
		driver.quit();
	}

}
