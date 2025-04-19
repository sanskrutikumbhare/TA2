class Main6 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            throw new CustomException("Custom Exception Occurred!");
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}