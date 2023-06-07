import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HW4  {

    WebDriver wd;

    @BeforeMethod
    public void init(){

        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testCss1() throws InterruptedException {

        List<WebElement> tr = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("roes = "+(tr.size()-1));

        List<WebElement> elements = wd.findElements(By.cssSelector("#customers tr th"));
        System.out.println("columns = " + elements.size());

        WebElement row3 = wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        String string = row3.getText();
        System.out.println(string);

        WebElement lastColumn = wd.findElement(By.cssSelector("#customers tr th:last-child"));
        string  = lastColumn.getText();
        System.out.println(string);
   init("https://telranedu.web.app/home");
   Thread.sleep(1000);
click(By.cssSelector("[href='/login']"));
        wd.findElements(By.cssSelector("[name='email']"));
        wd.findElements(By.cssSelector("div[class=login_login__3EHKB]"));
        wd.findElements(By.cssSelector("div[class=login_login__3EHKB] button:last-child"));
        // print amount of table rows
        // print amount of table columns
        // find locator for the row3
        // find locator for the last column


    }

    public void init(String url){
        wd.navigate().to(url);
    }
    public void click(By locator){
       WebElement element = wd.findElement(locator);
        element.click();
    }
}
