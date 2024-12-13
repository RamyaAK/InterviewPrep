import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;

public class BaseTest {
    // Logger for the test execution
    private static final Logger logger = Logger.getLogger(BaseTest.class.getName());

    @BeforeClass
    public void beforeClass() {
        // Code to run once before the first test method is executed
        logger.info("Before any test in the class");
        // Initialize any shared resources or configurations here
    }

    @BeforeMethod
    public void beforeMethod() {
        // Code to run before each test method
        logger.info("Before each test method");
        // Setup WebDriver or any shared resources here
    }

    @AfterMethod
    public void afterMethod() {
        // Code to run after each test method
        logger.info("After each test method");
        // Clean up resources, close WebDriver, etc.
    }

    @AfterClass
    public void afterClass() {
        // Code to run once after all test methods are executed
        logger.info("After all tests in the class");
        // Clean up any shared resources, logging, etc.
    }

    // Add any common utility methods here that can be used in your tests
    public void logTestStart(String testName) {
        logger.info("Starting test: " + testName);
    }

    public void logTestEnd(String testName) {
        logger.info("Ending test: " + testName);
    }
}
