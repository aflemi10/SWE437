import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class test {
    ChromeDriver driver = null;

    WebElement convertButton = null ;
    WebElement clearButton = null;

    WebElement fTextbox = null;
    WebElement cTextbox = null;

    private void delay(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void getPageElements(){
        convertButton = driver.findElementByName("submit");
        clearButton = driver.findElementByName("clear");

        fTextbox = driver.findElementByName("F");
        cTextbox = driver.findElementByName("C");
    }

    @BeforeEach
    public void setup(){
        this.driver=new ChromeDriver();
        this.driver.get("https://cs.gmu.edu:8443/offutt/servlet/conversion");
        getPageElements();
    }

    @AfterEach
    public void shutdown(){
        this.driver.close();
    }

    @Test
    public void testPositiveInt(){
        final String correctVal = "-11.11";
        final String inputVal = "12";
        fTextbox.sendKeys(inputVal);
        convertButton.click();
        getPageElements();
        String actualVal = cTextbox.getAttribute("value");
        assertEquals(actualVal.equals(correctVal),true);
    }

    @Test
    public void testNegativeInt(){
        final String correctVal = "-24.44";
        final String inputVal = "-12";
        fTextbox.sendKeys(inputVal);
        convertButton.click();
        getPageElements();
        String actualVal = cTextbox.getAttribute("value");
        assertEquals(actualVal.equals(correctVal),true);
    }

    @Test
    public void testZero(){
        final String correctVal = "-17.78";
        final String inputVal = "0";
        fTextbox.sendKeys(inputVal);
        convertButton.click();
        getPageElements();
        String actualVal = cTextbox.getAttribute("value");
        assertEquals(actualVal.equals(correctVal),true);
    }

    @Test
    public void testPositiveFloat(){
        final String correctVal = "-10.83";
        final String inputVal = "12.5";
        fTextbox.sendKeys(inputVal);
        convertButton.click();
        getPageElements();
        String actualVal = cTextbox.getAttribute("value");
        assertEquals(actualVal.equals(correctVal),true);
    }

    @Test
    public void testNegativeFloat(){
        final String correctVal = "-24.72";
        final String inputVal = "-12.5";
        fTextbox.sendKeys(inputVal);
        convertButton.click();
        getPageElements();
        String actualVal = cTextbox.getAttribute("value");
        assertEquals(actualVal.equals(correctVal),true);
    }

    @Test
    public void testClear(){
        final String correctVal = "";
        final String inputVal = "12";
        fTextbox.sendKeys(inputVal);
        clearButton.click();
        getPageElements();
        String actualVal = fTextbox.getAttribute("value");
        assertEquals(actualVal.equals(correctVal),true);
    }

    @Test
    public void testString(){
        final String correctVal = "Nan";
        final String inputVal = "Test String";
        fTextbox.sendKeys(inputVal);
        convertButton.click();
        getPageElements();
        String actualVal = cTextbox.getAttribute("value");
        assertEquals(actualVal.equals(correctVal),true);
    }
}


