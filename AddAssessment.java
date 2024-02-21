package Pom_Maplogik;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClassMaplogik;

public class AddAssessment extends BaseClassMaplogik{
	public void addAssessment() {
		
		driver.findElement(By.xpath("//span[text()='Skill Enhancement']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions actions=new Actions(driver);
		
		WebElement allTrainings=driver.findElement(By.xpath("//span[text()='All Trainings']"));
		actions.moveToElement(allTrainings).click().perform();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@title='Add Assessment'])[1]")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	}


