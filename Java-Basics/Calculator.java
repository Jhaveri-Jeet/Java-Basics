import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        Scanner scn = new Scanner(System.in);
        System.out.println("_____Welcome to Our Calculator_____");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Exit");
        System.out.print("Enter your number 1 : ");
        int number1 = scn.nextInt();
        System.out.print("Enter your number 2 : ");
        int number2 = scn.nextInt();
        System.out.print("Enter your Choice : ");
        int choice = scn.nextInt();
        switch (choice) {
            case 1:
                int add = number1 + number2;
                System.out.println("This is the ans of your addition " + add);
                break;

            case 2:
                int sub = number1 - number2;
                System.out.println("This is the ans of your subtraction " + sub);
                break;

            case 3:
                int mul = number1 * number2;
                System.out.println("This is the ans of your Multiplication " + mul);
                break;

            case 4:
                int div = number1 / number2;
                System.out.println("This is the ans of your Division " + div);
                break;

            case 5:
                System.out.println("Entered Wrong Choice ");
                break;
        }

    }

    public static void main(String[] args) {
//        System.out.println("This is an Calculator");
        calculate();
    }
}
