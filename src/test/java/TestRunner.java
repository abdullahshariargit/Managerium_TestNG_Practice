import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.misc.MessageUtils;

import java.security.Key;
import java.util.List;

public class TestRunner extends SetUp{
@Test(priority = 0)
    public void LogIn()
    {
        driver.get("https://mgm.ibos.io/");
        WebElement txtUser = driver.findElement(By.xpath("//input[@id='loginMobileNo']"));
        txtUser.sendKeys("01679172828");
        WebElement txtPass = driver.findElement(By.xpath("//input[@id='loginPassword']"));
        txtPass.sendKeys("mgm@arp");
        WebElement btn = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/button[1]"));
        btn.sendKeys(Keys.ENTER);

//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/button[1]")).click();
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[2]/div[1]/div[1]/a[1]")).click();
//        driver.findElement(By.xpath("//button[@id='demo-positioned-button']")).click();
    }
   @Test(priority = 1)
    public void assert1()
    {
        Assert.assertEquals(driver.findElement(By.xpath("//h5[contains(text(),'MANAGERIUM')]")).getText(),"MANAGERIUM");
    }
    @Test(priority = 2)
    public void purchaseReceive()
    {
        driver.findElement(By.xpath("//div[contains(text(),'Purchase')]")).click();
        List<WebElement> sidebarMenu= driver.findElements(By.className("sidebar-dropdown"));
        sidebarMenu.get(1).click();
    }
}
