import interview_programs.CountEvenOddDigitsInNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountEvenOddDigitsInNumberTests extends BaseTest{
    @Test
    public void testEvenOddDigitsPositiveNumber() {
        CountEvenOddDigitsInNumber counter = new CountEvenOddDigitsInNumber();
        int[] result = counter.countEvenOddDigits(123456); // 1, 2, 3, 4, 5, 6

        // Expected: 3 even digits (2, 4, 6) and 3 odd digits (1, 3, 5)
        Assert.assertEquals(result[0], 3, "Number of even digits should be 3");
        Assert.assertEquals(result[1], 3, "Number of odd digits should be 3");
    }

    @Test
    public void testEvenOddDigitsNegativeNumber() {
        CountEvenOddDigitsInNumber counter = new CountEvenOddDigitsInNumber();
        int[] result = counter.countEvenOddDigits(-123456); // 1, 2, 3, 4, 5, 6

        // Expected: 3 even digits (2, 4, 6) and 3 odd digits (1, 3, 5)
        Assert.assertEquals(result[0], 3, "Number of even digits should be 3");
        Assert.assertEquals(result[1], 3, "Number of odd digits should be 3");
    }

    @Test
    public void testEvenOddDigitsZero() {
        CountEvenOddDigitsInNumber counter = new CountEvenOddDigitsInNumber();
        int[] result = counter.countEvenOddDigits(0); // 0 is an even digit

        // Expected: 1 even digit (0), 0 odd digits
        Assert.assertEquals(result[0], 1, "Number of even digits should be 1");
        Assert.assertEquals(result[1], 0, "Number of odd digits should be 0");
    }

    @Test
    public void testEvenOddDigitsLargeNumber() {
        CountEvenOddDigitsInNumber counter = new CountEvenOddDigitsInNumber();
        int[] result = counter.countEvenOddDigits(987654321); // 9, 8, 7, 6, 5, 4, 3, 2, 1

        // Expected: 4 even digits (8, 6, 4, 2) and 5 odd digits (9, 7, 5, 3, 1)
        Assert.assertEquals(result[0], 4, "Number of even digits should be 4");
        Assert.assertEquals(result[1], 5, "Number of odd digits should be 5");
    }

    @Test
    public void testEvenOddDigitsSingleDigit() {
        CountEvenOddDigitsInNumber counter = new CountEvenOddDigitsInNumber();
        int[] result = counter.countEvenOddDigits(8); // 8 is an even digit

        // Expected: 1 even digit (8), 0 odd digits
        Assert.assertEquals(result[0], 1, "Number of even digits should be 1");
        Assert.assertEquals(result[1], 0, "Number of odd digits should be 0");
    }
}
