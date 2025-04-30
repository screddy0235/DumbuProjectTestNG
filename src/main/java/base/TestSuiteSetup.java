package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;

public class TestSuiteSetup {
    public static ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Sushmitha");
        }
    }

    @AfterSuite
    public void reportTeardown() {
        if (extent != null) {
            extent.flush();
        }
    }
}
