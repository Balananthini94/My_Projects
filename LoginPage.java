package Pom_Maplogik;

import org.openqa.selenium.By;

import Base.BaseClassMaplogik;

public class LoginPage extends BaseClassMaplogik{
	public void login() {
		driver.findElement(By.id("login-email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 waves-effect waves-float waves-light']")).click();
	}

}
