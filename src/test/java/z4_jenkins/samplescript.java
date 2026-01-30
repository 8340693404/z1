package z4_jenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class samplescript {
	@Test
	public void Test() {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        System.out.println("hiii");
        System.out.println("hiiiwwww");

	}

}
