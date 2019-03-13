import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementWebAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.findElement(By.name("email")).sendKeys("this is email");
        driver.findElement(By.id("pass")).sendKeys("this is password");
        driver.findElement(By.name("firstname")).sendKeys("First name");
        driver.findElement(By.name("lastname")).sendKeys("Last name");
        driver.findElement(By.name("reg_email__")).sendKeys("7180000000");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.linkText("Forgot account?")).click();


        driver.get("http://yahoo.com");
		driver.navigate().back();
        driver.close();
    }

}
