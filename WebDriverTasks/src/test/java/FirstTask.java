import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;

public class FirstTask {
    public static void main(String[] args) {
        WebDriver pastebin = new ChromeDriver();
        pastebin.get("https://pastebin.com");
        WebElement firstElement = pastebin.findElement(By.xpath("//*[@id=\"postform-text\"]"));
        firstElement.sendKeys("Hello from WebDriver");

        WebElement secondElement = pastebin.findElement(By.xpath("//*[@id=\"postform-name\"]"));
        secondElement.sendKeys("helloweb");

        pastebin.findElement(By.xpath("//*[@id=\"select2-postform-expiration-container\"]")).click();
        Actions actions = new Actions(pastebin);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        WebElement createPasteBtn =  pastebin.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button"));
        createPasteBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        pastebin.quit();
    }
}
