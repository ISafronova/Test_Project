package package111;


import java.util.Properties;


import org.junit.*;
import org.openqa.selenium.*;
import java.io.IOException;
import static org.junit.Assert.assertTrue;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;



/**
 * Unit test for simple App.
 */
public class AppTest {
    public static WebDriver driver;
    public static Properties prop;

    public static void LoadConfigFile() {
    }

    @Rule
    public ErrorCollector collector = new ErrorCollector();



    @Before
    public void openBrowser() {
    }

    @Test
    public void IncorrectLoginTest() throws Exception
    {
        try {
            System.out.println("****************************************");
        } catch (NoSuchElementException e){
                        assertTrue(false);
        }
    }




    @After
    public void saveScreenshotAndCloseBrowser() throws IOException {

    }



}