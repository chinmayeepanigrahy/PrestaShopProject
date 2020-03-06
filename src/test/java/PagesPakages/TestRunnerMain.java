package PagesPakages;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunnerMain {
    public static void main(String[] args)  {
       // System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\chinm\\WORKSPACESELENIUM\\PrestashopSeleniumJunit\\chromedriver.exe");

        Result result = JUnitCore.runClasses(PrestaShopTest.class);
        System.out.println("Result =" + result.wasSuccessful());


    }
}
