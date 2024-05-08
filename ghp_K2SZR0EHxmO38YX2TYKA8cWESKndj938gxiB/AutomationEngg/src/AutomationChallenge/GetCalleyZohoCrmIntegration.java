package AutomationChallenge;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class GetCalleyZohoCrmIntegration {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/calley-zoho-crm-integration/']")).click();
		EventFiringWebDriver e = new EventFiringWebDriver(driver);
		File src = e.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Resolutions-Screenshot/Cally-Zohocrm-Integration-08-05-2024-at4.54pm.png");
		Files.copy(src, dest);
	}

}

