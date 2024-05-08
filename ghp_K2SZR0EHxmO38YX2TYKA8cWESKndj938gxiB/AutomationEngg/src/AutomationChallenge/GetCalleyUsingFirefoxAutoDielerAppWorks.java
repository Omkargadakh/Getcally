package AutomationChallenge;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class GetCalleyUsingFirefoxAutoDielerAppWorks {
	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		driver.findElement(By.xpath("//a[text()='https://www.getcalley.com/how-calley-auto-dialer-app-works/']")).click();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Resolutions-Screenshot/CallyAutoDialerAppWorks-08-05-2024-at4.54pm.png");
		Files.copy(src, dest);
	}

}

