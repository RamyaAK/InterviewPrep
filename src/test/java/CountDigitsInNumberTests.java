import interview_programs.CountDigitsInNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountDigitsInNumberTests extends BaseTest{
    // Test case for a positive number
    @Test
    public void testCountDigitsPositiveNumber() {
        CountDigitsInNumber counter = new CountDigitsInNumber();
        int result = counter.countDigits(12345);  // 5 digits
        Assert.assertEquals(result, 5, "The digit count should be 5");
    }

    // Test case for a single digit number
    @Test
    public void testCountDigitsSingleDigit() {
        CountDigitsInNumber counter = new CountDigitsInNumber();
        int result = counter.countDigits(7);  // 1 digit
        Assert.assertEquals(result, 1, "The digit count should be 1");
    }

    // Test case for a number with zeroes in it
    @Test
    public void testCountDigitsWithZeroes() {
        CountDigitsInNumber counter = new CountDigitsInNumber();
        int result = counter.countDigits(100200);  // 6 digits
        Assert.assertEquals(result, 6, "The digit count should be 6");
    }

    // Test case for zero input (0 is a special case)
    @Test
    public void testCountDigitsZero() {
        CountDigitsInNumber counter = new CountDigitsInNumber();
        int result = counter.countDigits(0);  // 1 digit (since 0 is a single digit)
        Assert.assertEquals(result, 1, "The digit count for 0 should be 1");
    }

    // Test case for a large number
    @Test
    public void testCountDigitsLargeNumber() {
        CountDigitsInNumber counter = new CountDigitsInNumber();
        int result = counter.countDigits(987654321);  // 10 digits
        Assert.assertEquals(result, 9, "The digit count should be 9");
    }

    // Test case for negative number
    @Test
    public void testCountDigitsNegativeNumber() {
        CountDigitsInNumber counter = new CountDigitsInNumber();
        int result = counter.countDigits(-12345);  // 5 digits
        Assert.assertEquals(result, 5, "The digit count for -12345 should be 5");
    }
}
