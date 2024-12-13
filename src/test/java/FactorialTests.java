import interview_programs.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTests extends BaseTest{
    @Test
    public void testFactorialPositiveNumber() {
        Factorial factorialObj = new Factorial();
        String result = factorialObj.calculateFactorial(5);

        // Expected: 120
        Assert.assertEquals(result, "120", "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorialZero() {
        Factorial factorialObj = new Factorial();
        String result = factorialObj.calculateFactorial(0);

        // Expected: "Factorial of 0 is 1"
        Assert.assertEquals(result, "Factorial of 0 is 1", "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorialNegativeNumber() {
        Factorial factorialObj = new Factorial();
        String result = factorialObj.calculateFactorial(-5);

        // Expected: "Factorial is not defined for negative numbers"
        Assert.assertEquals(result, "Factorial is not defined for negative numbers",
                "Factorial of negative numbers should not be defined");
    }

    @Test
    public void testFactorialLargeNumber() {
        Factorial factorialObj = new Factorial();
        String result = factorialObj.calculateFactorial(10);

        // Expected: 3628800
        Assert.assertEquals(result, "3628800", "Factorial of 10 should be 3628800");
    }

    @Test
    public void testFactorialSingleDigitNumber() {
        Factorial factorialObj = new Factorial();
        String result = factorialObj.calculateFactorial(3);

        // Expected: 6
        Assert.assertEquals(result, "6", "Factorial of 3 should be 6");
    }
}
