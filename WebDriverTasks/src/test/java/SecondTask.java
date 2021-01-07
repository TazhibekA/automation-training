import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTask {
    WebDriver pastebin;

    @Before
    public void CreateNewPaste () {
        pastebin = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(pastebin,30,500);
        pastebin.get("https://pastebin.com");
        WebElement firstElement = pastebin.findElement(By.xpath("//*[@id=\"postform-text\"]"));
        firstElement.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");


        WebElement secondElement = pastebin.findElement(By.xpath("//*[@id=\"postform-name\"]"));
        secondElement.sendKeys("how to gain dominance among developers");

        pastebin.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[1]/div/span/span[1]/span")).click();
        Actions actions1 = new Actions(pastebin);
        actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        pastebin.findElement(By.xpath("//*[@id=\"select2-postform-expiration-container\"]")).click();
        Actions actions = new Actions(pastebin);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        WebElement createPasteBtn =  pastebin.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button"));
        createPasteBtn.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("info-top")));
    }
    @Test
    public void rightPasteName(){
        String textOfPasteName="how to gain dominance among developers";
        Assert.assertEquals(pastebin.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/h1")).getText(),textOfPasteName);
    }

    @Test
    public void rightSyntaxHighlighting(){
        String textOfSyntaxHighlighting="Bash";
        //System.out.println(pastebin.findElement(By.linkText("Bash")).getText());
        Assert.assertEquals(pastebin.findElement(By.linkText("Bash")).getText(),textOfSyntaxHighlighting);
    }

    @Test
    public void rightPasteCode(){
        String textOfCode="git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        Assert.assertEquals(pastebin.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/textarea")).getText(),textOfCode);
    }

    @After
    public void tearDown(){
        pastebin.quit();
    }
}
