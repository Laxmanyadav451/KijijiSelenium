package Tests;

import PgeObjects.AutoNewPageObjects;
import PgeObjects.KijijiHomepage;
import PgeObjects.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kijijitest {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxman\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver Driver=new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://www.kijiji.ca/");

        AutoNewPageObjects anpo=new AutoNewPageObjects(Driver);
        KijijiHomepage khp=new KijijiHomepage(Driver);
        CommonUtils cu=new CommonUtils(Driver);

        cu.sendkeysToElement(khp.Searchfield,"iphone");
        cu.ClickElement(khp.Searchsubmit);
        Thread.sleep(6000);
        cu.jsClick(khp.checkbox);
        Thread.sleep(3000);
        cu.ClickElement(khp.Close);



        String Output= anpo.getTextByXpath(khp.Text);
        anpo.clickbyxpth(khp.Sort);
        anpo.clickbyxpth(khp.post);
        Thread.sleep(3000);

        anpo.clickbyxpth(khp.register);
        anpo.sendkeysbyid(khp.name, "Laxman");
        anpo.sendkeysbyid(khp.email,"adhags@djand.com");
        anpo.sendkeysbyid(khp.password, "54586");
        anpo.sendkeysbyid(khp.repassword,"54586");
        anpo.clickbyxpth(khp.createaccount);
















    }
}
