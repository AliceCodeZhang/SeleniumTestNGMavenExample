package example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.FileAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

public class NewTest {
  private WebDriver driver;
  @Test
  public void test() {
	 driver.get("http://baidu.com");
	 String title = driver.getTitle();
	 AssertJUnit.assertTrue(title.contains("百度"));
  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "/usr/local/Cellar/chromedriver/2.32/bin/chromedriver");
	 driver = new ChromeDriver();}

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
