package tests.day02_webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 3. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedTitleIcerik = "Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("PAGE TITLE TEST PASSED");
        } else {
            System.out.println("PAGE TITLE TEST FAILED");
        }
        // 4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        // 5. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrlIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("URL TEST PASSED");
        } else {
            System.out.println("URL TEST FAILED");
        }

        // 6. Sayfa handle degerini yazdirin
        System.out.println("Sayfa handle degeri: " + driver.getWindowHandle());

        // 7. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSourceIcerik = "alisveris";
        String actualPageSource = driver.getPageSource();
        if (actualPageSource.contains(expectedSourceIcerik)){
            System.out.println("SOURCE CODE TEST PASSED");
        }else {
            System.out.println("SOURCE CODE TEST FAILED");
        }

        // 8. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }
}
