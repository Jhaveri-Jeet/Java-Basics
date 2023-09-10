class Calculator {

  public static void main(String args[]) {
    int choice = 1;
    int num1 = 10;
    int num2 = 10;
    int add = num1 + num2;
    int sub = num1 - num2;
    int mul = num1 * num2;
    int div = num1 / num2;
    switch (choice) {
      case 1:
        System.out.println("Addition : " + add);
        break;
      case 2:
        System.out.println("Substraction : " + sub);
        break;
      case 3:
        System.out.println("Multiplication: " + mul);
        break;
      case 4:
        System.out.println("Division : " + div);
        break;
    }
  }
}
