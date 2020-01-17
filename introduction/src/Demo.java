import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver","F:\\3rd party IE driver\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://goibibo.com");
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys("Bhu");
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		

	}

}
