package test;

import org.testng.annotations.Test;

import page.HomePage;

public class HomePageTest extends BaseTest {
	
@Test

public void HomeTest() {
	HomePage f = new HomePage(driver);
	f.clickonaccountbutton();

}
}