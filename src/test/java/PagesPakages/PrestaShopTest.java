package PagesPakages;

import org.junit.*;
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Before
    public void goHome() {
        System.out.println("Before ---- goHome");
        //click homebutton
    }

    //1.As a user i want to click a log in account
    @Test
    public void clickSignInButton() {
        driver.switchTo().frame("framelive");
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.navigate().back();
        driver.navigate().refresh();
    }

    //2.As a user i want to create a new account
    @Test
    public void userStory2() {
        driver.switchTo().frame("framelive");
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.cssSelector(".no-account")).click();
        driver.navigate().back();
        driver.navigate().refresh();

    }
    //3. As a user i created a new account and out some details

    @Test
    public void userStory3() {
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
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();

    }

    //As a user i want to search Accessories


    @Test
    public void userStory5() {
        try {
            driver.switchTo().frame("framelive");
            driver.findElement(By.id("category-6")).click();
            driver.findElement(By.linkText("Brown bear cushion")).click();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//input[@name='s']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //As a user user i am taking contact us as a user story

    @Test
    public void userStory6() {
        driver.switchTo().frame("framelive");
        driver.findElement(By.linkText("Contact us")).click();
        driver.findElement(By.name("id_contact")).click();
        driver.findElement(By.name("from")).sendKeys("chinu.pani@gmail.com");
        driver.findElement(By.name("message")).sendKeys("Hello i want to change mt dress");
        driver.findElement(By.name("submitMessage")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();
    }

    //AS a user i want to subscribe for a newsletter
    @Test
    public void userStory7() {
        driver.switchTo().frame("framelive");
        driver.findElement(By.name("email")).sendKeys("chuni.padhy@gmail.com");
        driver.findElement(By.name("submitNewsletter")).click();
        driver.navigate().back();
        driver.navigate().refresh();

    }

    //As a user i want to search a Art size of (40*60)
    @Test
    public void userStory8() {

        try {
            driver.switchTo().frame("framelive");
            driver.findElement(By.id("category-9")).click();
            driver.findElement(By.cssSelector(".ps-shown-by-js")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
