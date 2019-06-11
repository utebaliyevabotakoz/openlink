import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    private static  final Logger logger = LogManager.getLogger(HomeWork.class);


    @Test
    public  void homeWork() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        logger.debug("SET ChromeDriver");
        driver.get("https://otus.ru/");
        logger.debug("OPEN https://otus.ru/");
        driver.quit();
        logger.debug("QUIT https://otus.ru/");
    } //
}