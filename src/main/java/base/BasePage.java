package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BasePage {
    public WebDriver driver;
    public ExtentTest test;

    @BeforeMethod
    public void setup(Method method) {
        // Ensure extent is initialized in case @BeforeSuite didn’t run
        if (TestSuiteSetup.extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
            TestSuiteSetup.extent = new ExtentReports();
            TestSuiteSetup.extent.attachReporter(reporter);
            TestSuiteSetup.extent.setSystemInfo("Tester", "Fallback Init");
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.warepro.in/webui/index.zul");

        test = TestSuiteSetup.extent.createTest(method.getName());
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test passed");
        }
        driver.quit();
    }
}
