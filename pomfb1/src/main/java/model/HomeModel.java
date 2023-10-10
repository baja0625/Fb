package model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeModel extends BaseModel {

	public HomeModel(WebDriver d) {
	super(d);
	
	}
	
	public WebElement grab() {
		WebElement button = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		return button;

	}
	
	

}
