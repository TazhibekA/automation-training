import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;

public class FourthTask {
    WebDriver pastebin;
    WebDriverWait wait;

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

        switchToFrameByName(pastebin,"myFrame");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input_63")));

        pastebin.findElement(By.id("input_63")).sendKeys("4");
        Thread.sleep(2000);
        Actions actions = new Actions(pastebin);

        WebElement location = pastebin.findElement(By.id("select_value_label_61"));
        wait.until(ExpectedConditions.elementToBeClickable(location));
        location.click();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER).perform();

        WebElement commited = pastebin.findElement(By.id("select_value_label_62"));
        wait.until(ExpectedConditions.elementToBeClickable(commited));
        commited.click();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        WebElement btn = pastebin.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[13]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(btn));
        btn.click();
        WebElement emailEst = pastebin.findElement(By.id("email_quote"));
        wait.until(ExpectedConditions.elementToBeClickable(emailEst));
        emailEst.click();
    }

    @Test
    public void checkEstimate() throws InterruptedException {
        wait = new WebDriverWait(pastebin,15,500);

        ((JavascriptExecutor) pastebin).executeScript("window.open()");
        pastebin.get("https://10minutemail.com/");
        ArrayList<String> tabs = new ArrayList<String> (pastebin.getWindowHandles());
        String mail_address = pastebin.findElement(By.id("mail_address")).getText();
        pastebin.switchTo().window(tabs.get(0)); // switch back to main screen

        pastebin.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(mail_address);
        pastebin.findElement(By.xpath("//*[@id=\"dialogContent_390\"]/form/md-dialog-actions/button[2]")).click();

        pastebin.switchTo().window(tabs.get(1));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("inbox_count_number"), "1"));
        pastebin.findElement(By.xpath("//*[@id=\"mail_messages_content\"]/div[1]")).click();
        String  totalCost = pastebin.findElement(By.xpath("//*[@id=\"mobilepadding\"]/td/table/tbody/tr[2]/td[2]/h3")).getText();
        pastebin.switchTo().window(tabs.get(0));
        String totalCostInGoogle = pastebin.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[5]/div/b")).getText();
        Assert.assertTrue(totalCostInGoogle.contains(totalCost));

    }

    @After
    public void tearDown(){
        pastebin.quit();
    }

    public static void switchToFrameByName(WebDriver driver, String name){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(name);
    }


}
