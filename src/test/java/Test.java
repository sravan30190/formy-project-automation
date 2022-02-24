import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium-1\\drivers\\geckodriver\\geckodriver.exe");
	WebDriver wd= new FirefoxDriver();	
	wd.get("https://formy-project.herokuapp.com/switch-window");
	/*WebElement name=wd.findElement(By.id("name"));
	name.click();
	name.sendKeys("Sravan"); 
	WebElement button=wd.findElement(By.id("button"));
	button.click(); */
	/*
	WebElement ac=wd.findElement(By.id("autocomplete"));
	ac.sendKeys("1555 Park Blvd, Palo Alto,CA");
	Thread.sleep(1000);
	WebElement res=wd.findElement(By.id("pac-item"));
	res.click(); */
	
	/*WebElement name=wd.findElement(By.id("name"));
	Actions act=new Actions(wd);
	act.moveToElement(name);
	name.sendKeys("Sravan");
	WebElement date=wd.findElement(By.id("date"));
	date.sendKeys("24/02/2022");*/
	WebElement tab=wd.findElement(By.id("new-tab-button"));
	tab.click();
	String org=wd.getWindowHandle();
	for(String h:wd.getWindowHandles())
	{
		wd.switchTo().window(h);
	}
	wd.switchTo().window(org);
	}

}
