package class04HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBoxBtn = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean checkBox = checkBoxBtn.isSelected();

        if (!checkBox) {
            checkBoxBtn.click();
        }
            checkBox = checkBoxBtn.isSelected();
            System.out.println(checkBox);

            driver.quit();



    }
}
