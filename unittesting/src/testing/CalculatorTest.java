package testing;

public class CalculatorTest {

   @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3); // Example: Adding 5 + 3
        assertEquals(8, result);           // Expecting the result to be 8
    }

	private void assertEquals(int i, int result) {
		// TODO Auto-generated method stub
		
	}
}