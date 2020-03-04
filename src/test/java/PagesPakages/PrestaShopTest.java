package PagesPakages;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PrestaShopTest {
    static WebDriver driver = new ChromeDriver();


    @BeforeClass
    public static void setUp() {
        System.out.println("Beforeclass ..... setUp");
        driver.get("http://demo.prestashop.com/#/en/front");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Before
    public void goHome() {
        System.out.println("Before ---- goHome");
        //click homebutton
    }

    //As a user i want to click a log in account
    @Test
    public void clickSignInButton() {
        //driver.findElement(By.xpath("//iframe[@id='framelive']"));
        driver.switchTo().frame("framelive");
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
    }

    //As a user i want to create a new account
    @Test
    public void userStory3() {
        driver.switchTo().frame("framelive");
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.cssSelector(".no-account")).click();

    }
    // As a user i created a new account and out some details

    @Test
    public void userStory4() {
        driver.switchTo().frame("framelive");
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.cssSelector(".no-account")).click();
        driver.findElement(By.name("id_gender")).click();
        driver.findElement(By.name("firstname")).sendKeys("shrreya");
        driver.findElement(By.name("lastname")).sendKeys("panigrahy");
        driver.findElement(By.name("email")).sendKeys("shreeya.panigrahy@gmail.com");
        driver.findElement(By.name("password")).sendKeys("shreeya9");
        driver.findElement(By.name("birthday")).sendKeys("07/20/1988");
        driver.findElement(By.name("psgdpr")).click();
        driver.findElement(By.cssSelector(".form-control-submit")).click();

    }

    @Test
    public void userStory() {
        driver.switchTo().frame("framelive");
        driver.manage().window().maximize();
        driver.findElement(By.id("category-9")).click();
        driver.findElement(By.cssSelector(".ps-shown-by-js")).click();
        driver.findElement(By.linkText("Today is a good day Framed...")).click();

    }

    //As a user i want to search Accessories
    @Test
    public void userStory5() {

        driver.switchTo().frame("framelive");
        driver.findElement(By.name("s")).sendKeys("Accessories");
        driver.findElement(By.xpath("//input[@name='s']")).click();
    }

    @Test
    public void userStory7() {

        driver.switchTo().frame("framelive");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Contact us")).click();
        driver.findElement(By.name("id_contact")).click();
        driver.findElement(By.name("from")).sendKeys("chinu.pani@gmail.com");
        driver.findElement(By.cssSelector(".buttonText")).sendKeys("c://newhtml.html");
        driver.findElement(By.name("message")).sendKeys("Hello i want to change mt dress");
        driver.findElement(By.name("submitMessage")).click();
    }

    @Test
    public void userStory8() {

        driver.switchTo().frame("framelive");
        driver.manage().window().maximize();
        driver.findElement(By.name("submitNewsletter")).sendKeys("shreeya.panigrahy@gmail.com");


    }
}