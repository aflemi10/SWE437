import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class test {
    ChromeDriver driver = null;

    WebElement convertButton = null ;
    WebElement clearButton = null;

    WebElement fTextBox = null;
    WebElement cTextBox = null;

    WebElement inTextBox = null;
    WebElement cmTextBox = null;

    WebElement ftTextBox = null;
    WebElement mTextBox = null;

    WebElement miTextBox = null;
    WebElement kmTextBox = null;

    WebElement galTextBox = null;
    WebElement LTextBox = null;

    WebElement ozTextBox = null;
    WebElement gTextBox = null;

    WebElement lbTextBox = null;
    WebElement kgTextBox = null;

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

        fTextBox = driver.findElementByName("F");
        cTextBox = driver.findElementByName("C");

        inTextBox = driver.findElementByName("in");
        cmTextBox = driver.findElementByName("cm");

        ftTextBox = driver.findElementByName("ft");
        mTextBox = driver.findElementByName("m");

        miTextBox = driver.findElementByName("mi");
        kmTextBox = driver.findElementByName("km");

        galTextBox = driver.findElementByName("gal");
        LTextBox = driver.findElementByName("L");

        ozTextBox = driver.findElementByName("oz");
        gTextBox = driver.findElementByName("g");

        lbTextBox = driver.findElementByName("lb");
        kgTextBox = driver.findElementByName("kg");

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
    public void testPathOne(){
        fTextBox.sendKeys("-42");
        cmTextBox.sendKeys("-75");
        mTextBox.sendKeys("56");
        ftTextBox.sendKeys("90");
        kmTextBox.sendKeys("-48");
        miTextBox.sendKeys("81");
        galTextBox.sendKeys("11");
        gTextBox.sendKeys("-16");
        ozTextBox.sendKeys("-44");
        kgTextBox.sendKeys("68");
        lbTextBox.sendKeys("55");
        convertButton.click();
        getPageElements();

        assertEquals(cTextBox.getAttribute("value").equals("-41.11"),true);
        assertEquals(inTextBox.getAttribute("value").equals("-29.53"),true); //fails
        assertEquals(ftTextBox.getAttribute("value").equals("183.73"),true);
        assertEquals(mTextBox.getAttribute("value").equals("27.43"),true);
        assertEquals(miTextBox.getAttribute("value").equals("-29.83"),true);
        assertEquals(kmTextBox.getAttribute("value").equals("130.36"),true);
        assertEquals(LTextBox.getAttribute("value").equals("41.64"),true);
        assertEquals(ozTextBox.getAttribute("value").equals("-0.56"), true);
        assertEquals(gTextBox.getAttribute("value").equals("-1247.38"),true);
        assertEquals(lbTextBox.getAttribute("value").equals("149.91"),true);
        assertEquals(kgTextBox.getAttribute("value").equals("24.95"), true);
    }


    @Test
    public void testPathTwo(){
        inTextBox.sendKeys("-3");
        ftTextBox.sendKeys("86");
        kmTextBox.sendKeys("65");
        ozTextBox.sendKeys("-9");
        kgTextBox.sendKeys("27");
        convertButton.click();
        getPageElements();

        //Implement Oracle
        assertEquals(cmTextBox.getAttribute("value").equals("-7.62"),true);
        assertEquals(mTextBox.getAttribute("value").equals("26.21"),true);
        assertEquals(miTextBox.getAttribute("value").equals("40.39"),true);
        assertEquals(gTextBox.getAttribute("value").equals("-255.15"),true);//fails
        assertEquals(lbTextBox.getAttribute("value").equals("59.52"),true);


        //assertEquals(true,true);
    }


    @Test
    public void testPathThree(){
        cTextBox.sendKeys("-23");
        mTextBox.sendKeys("-87");
        galTextBox.sendKeys("37");
        gTextBox.sendKeys("66");
        convertButton.click();
        getPageElements();

        //Implement oracle
        assertEquals(fTextBox.getAttribute("value").equals("-9.4"),true);
        assertEquals(ftTextBox.getAttribute("value").equals("-285.43"),true);//fails
        assertEquals(LTextBox.getAttribute("value").equals("140.06"),true);
        assertEquals(ozTextBox.getAttribute("value").equals("2.33"),true);
    }


    @Test
    public void testPathFour(){
        cTextBox.sendKeys("-4");
        ftTextBox.sendKeys("-51");
        cmTextBox.sendKeys("66");
        inTextBox.sendKeys("-28");
        miTextBox.sendKeys("-31");
        LTextBox.sendKeys("-69");
        lbTextBox.sendKeys("20");
        convertButton.click();
        getPageElements();

        //Implement oracle

        assertEquals(fTextBox.getAttribute("value").equals("39.2"),true);//fails
        assertEquals(cTextBox.getAttribute("value").equals("-46.11"),true);
        assertEquals(inTextBox.getAttribute("value").equals("25.98"),true);
        assertEquals(cmTextBox.getAttribute("value").equals("-71.12"),true);
        assertEquals(kmTextBox.getAttribute("value").equals("-49.89"),true);
        assertEquals(galTextBox.getAttribute("value").equals("-261.19"),true);
        assertEquals(kgTextBox.getAttribute("value").equals("9.07"),true);
    }

}


