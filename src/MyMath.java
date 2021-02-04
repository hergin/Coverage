public class MyMath {

    public static double Divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Can't divide to zero!");
        double result = a / b;
        return result;
    }

    public static int Fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("There is no Fibonacci for negative numbers!");
        if (n == 1 || n == 0)
            return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

}
