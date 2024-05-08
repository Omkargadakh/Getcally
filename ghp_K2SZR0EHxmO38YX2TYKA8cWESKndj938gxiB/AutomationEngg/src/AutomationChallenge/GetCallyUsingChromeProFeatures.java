package AutomationChallenge;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GetCallyUsingChromeProFeatures {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/calley-pro-features/']")).click();
		RemoteWebDriver driver2 = (RemoteWebDriver) driver;
		File src = driver2.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Resolutions-Screenshot/CallyProFeatures-08-05-2024-at5.10pm.png");
		Files.copy(src, dest);
	}

}

