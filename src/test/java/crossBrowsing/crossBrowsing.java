package crossBrowsing;

import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowsing {
    public static void main(String [] args){

        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();




    }
}
