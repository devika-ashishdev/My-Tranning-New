class Factorial {
 public static int factorial(int n) {
 int result = 1;
 for (int i = 2; i <= n; i++) {
  result *= i;
  }
  return result;
  }

 public static void main(String[] args) {
  int n = 5;
  int fact = factorial(n);
 System.out.println("Factorial of " + n + " is " + fact);
  }
}