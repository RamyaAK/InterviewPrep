import interview_programs.FibonacciSeries;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibonacciSeriesTests extends BaseTest{
    @Test
    public void testFibonacciSeriesValidInput() {
        FibonacciSeries fibonacciObj = new FibonacciSeries();
        List<Integer> result = fibonacciObj.generateFibonacci(5);

        // Expected: [0, 1, 1, 2, 3]
        Assert.assertEquals(result, Arrays.asList(0, 1, 1, 2, 3), "Fibonacci series for 5 terms should match.");
    }

    @Test
    public void testFibonacciSeriesSingleTerm() {
        FibonacciSeries fibonacciObj = new FibonacciSeries();
        List<Integer> result = fibonacciObj.generateFibonacci(1);

        // Expected: [0]
        Assert.assertEquals(result, Collections.singletonList(0), "Fibonacci series for 1 term should match.");
    }

    @Test
    public void testFibonacciSeriesTwoTerms() {
        FibonacciSeries fibonacciObj = new FibonacciSeries();
        List<Integer> result = fibonacciObj.generateFibonacci(2);

        // Expected: [0, 1]
        Assert.assertEquals(result, Arrays.asList(0, 1), "Fibonacci series for 2 terms should match.");
    }

    @Test
    public void testFibonacciSeriesZeroTerms() {
        FibonacciSeries fibonacciObj = new FibonacciSeries();
        List<Integer> result = fibonacciObj.generateFibonacci(0);

        // Expected: []
        Assert.assertEquals(result, Collections.emptyList(), "Fibonacci series for 0 terms should be empty.");
    }

    @Test
    public void testFibonacciSeriesNegativeTerms() {
        FibonacciSeries fibonacciObj = new FibonacciSeries();
        List<Integer> result = fibonacciObj.generateFibonacci(-5);

        // Expected: []
        Assert.assertEquals(result, Collections.emptyList(), "Fibonacci series for negative terms should be empty.");
    }

    @Test
    public void testFibonacciSeriesLargeNumber() {
        FibonacciSeries fibonacciObj = new FibonacciSeries();
        List<Integer> result = fibonacciObj.generateFibonacci(10);

        // Expected: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
        Assert.assertEquals(result, Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34),
                "Fibonacci series for 10 terms should match.");
    }

}
