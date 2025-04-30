package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void login(String username, String password) {
        driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }


}
