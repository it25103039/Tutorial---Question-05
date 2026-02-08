class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public int square(int a) {
        return a * a;
    }
}

// Demo class with main method
public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int part1 = calc.multiply(3, 4);   // 3 * 4
        int part2 = calc.multiply(5, 7);   // 5 * 7
        int sum1 = calc.add(part1, part2); // add results
        int result1 = calc.square(sum1);   // square the sum
        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int sum2 = calc.add(4, 7);         // 4 + 7
        int sum3 = calc.add(8, 3);         // 8 + 3
        int square1 = calc.square(sum2);   // (4 + 7)^2
        int square2 = calc.square(sum3);   // (8 + 3)^2
        int result2 = calc.add(square1, square2); // add both squares
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
