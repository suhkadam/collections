package list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.get("https://www.goindigo.in/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/input")).click();

        Select adult= new Select(driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[1]/label[2]/select")));
        adult.selectByIndex(1);

        adult.selectByVisibleText("5");


        driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/input[1]")).click();
        driver.findElement(By.xpath("(//*[@class='field_box'])[2]/ul/li/div/ul/li[4]")).click();
        driver.findElement(By.xpath("(//*[@class='field_box'])[2]/ul/li[2]/div/ul/li[4]")).click();
        driver.close();
    }

}
