package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private App calculator;
	    
	    @Before
	    public void setUp() {
	        calculator = new App();
	    }

		@Test
	    public void testAdd() {
	        double a = 15.0;
	        double b = 20.0;
	        double expectedResult = 35.0;
	        double result = calculator.Add(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
	    }
		
		@Test
		public void testSubtract() {
			double a = 15.0;
	        double b = 12.0;
	        double expectedResult = 3.0;
	        double result = calculator.Subtract(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testMultiply() {
			double a = 8.0;
	        double b = 12.0;
	        double expectedResult = 96.0;
	        double result = calculator.Multiply(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}
}
