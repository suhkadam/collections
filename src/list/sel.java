package list;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.name("search_query")).sendKeys("Printed Chiffon Dress");
		driver.findElement(By.name("submit_search")).sendKeys(Keys.ENTER);
        driver.close();
    }

}
