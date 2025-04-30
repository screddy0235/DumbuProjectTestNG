package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class DashBoardPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void order(String tabtype, String qunatity) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class=\"z-bandbox-input\"]")).sendKeys(tabtype);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class=\"z-bandbox-input\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='OK'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title=\"New    Alt+N\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//td[@title=\"Edit Record\"])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(((//span[text()='Target Document Type'])[1])//following::i)[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("((//span[text()='Target Document Type'])[1]//following::div[contains(@class,'z-combobox-popup')])[last()]//li[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(((//span[text()='Supplier'])[1])//following::i[@class=\"z-icon-BPartner\"])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@title=\"ReQuery\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(((//tr[@class=\"z-listitem\"])[2])//following::span[@class=\"z-listitem-checkable z-listitem-radio\"])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[text()='OK'])[last()]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("((//span[text()='Warehouse'])[4]//following::a[@aria-label=\"Expand\"])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("((//span[text()='Warehouse'])[1]//following::div[contains(@class,'z-combobox-popup')])[last()]//li[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title=\"Save Changes    Alt+S\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class=\"z-south-collapsed\"])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("((//div[@role=\"tabpanel\"])[5]//preceding::i[@class=\"z-icon-New\"])[last()]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//i[@class=\"z-icon-Product\"])[last()]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@title=\"ReQuery\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[@class=\"z-listitem-checkable z-listitem-checkbox\"])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[text()='OK'])[last()]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[contains(@title,\"The Quantity\")]//input)[1]")).clear();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[contains(@title,\"The Quantity\")]//input)[1]")).sendKeys(qunatity);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title=\"Save Changes    Alt+S\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[text()='Purchase Order'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//i[@class=\"z-icon-Process\"])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[text()='Document Action'])[last()]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[text()='Complete'])[last()]")).click();
        Thread.sleep(7000);
        driver.quit();

    }

}
