package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsResizeable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions builder= new Actions(driver);
		
		driver.switchTo().frame(0);
		WebElement reSize = driver.findElement(By.xpath("//div[@id='resizable']/div[1]"));
		Point location = reSize.getLocation();
		int x=location.getX();
		int y=location.getY();
		builder.dragAndDropBy(reSize, 80, 50).perform();
		
	}

}
