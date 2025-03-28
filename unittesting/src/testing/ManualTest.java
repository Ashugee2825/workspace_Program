package testing;

public class ManualTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Custom assertion for add method
        int result = calc.add(3, 5);
        if (result == 8) {
            System.out.println("Test Passed: add(3, 5) returned 8");
        } else {
            System.out.println("Test Failed: add(3, 5) returned " + result + " instead of 8");
        }
    }
}