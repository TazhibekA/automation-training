import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class ThirdTask {
    WebDriver pastebin;


    @Before
    public  void SetUp() throws InterruptedException {
        pastebin = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(pastebin,15,500);
        pastebin.get(" https://cloud.google.com/ ");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input")));
        pastebin.findElement(By.xpath("/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input")).sendKeys("Google Cloud Platform Pricing Calculator");
        new Actions(pastebin).sendKeys(Keys.ENTER).perform();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("gsc-resultsbox-visible")));

        System.out.println(pastebin.getCurrentUrl());
        pastebin.findElement(By.linkText("Google Cloud Platform Pricing Calculator")).click();




        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"cloud-site\"]/devsite-iframe/iframe")));

        pastebin.switchTo().defaultContent();
        pastebin.switchTo().frame(0);
        pastebin.switchTo().frame("myFrame");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input_63")));

        //fill up
        //number of instances


        pastebin.findElement(By.id("input_63")).sendKeys("4");
        Thread.sleep(2000);
        Actions actions = new Actions(pastebin);


        WebElement location = pastebin.findElement(By.id("select_value_label_61"));
        wait.until(ExpectedConditions.elementToBeClickable(location));
        location.click();




        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER).perform();


        //commited usage


        WebElement commited = pastebin.findElement(By.id("select_value_label_62"));
        wait.until(ExpectedConditions.elementToBeClickable(commited));
        commited.click();

        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        Thread.sleep(5000);
        WebElement btn = pastebin.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[13]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(btn));
        btn.click();

     }


    @Test
    public void checkEstimate(){
        Assert.assertTrue(pastebin.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[2]/div")).getText().contains("VM class: regular"));
        Assert.assertTrue(pastebin.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[3]/div")).getText().contains("Instance type: e2-standard-2"));
        Assert.assertTrue(pastebin.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[4]/div")).getText().contains("Region: Frankfurt"));
        Assert.assertTrue(pastebin.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[5]/div")).getText().contains("Commitment term: 1 Year"));

    }

    @After
    public void tearDown(){
        pastebin.quit();
    }






}
