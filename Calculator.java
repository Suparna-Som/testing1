import java.util.Scanner;
public class Calculator {
    public static void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition of " + a + "+" + b + "=" + c);
    }

    private static void sub(int a, int b) {
        int c = a - b;
        System.out.println("Substraction of " + a + "-" + b + "=" + c);
    }

    private static void mult(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication of " + a + "*" + b + "=" + c);
    }

    private static void div(float a, float b) {
        float c = a / b;
        System.out.println("Division of " + a + "/" + b + "=" + c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice of Calculation");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        System.out.println("Enter first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter second Number : ");
        int b = sc.nextInt();
        switch (choice) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                mult(a, b);
                break;
            case 4:
                div(a, b);
                break;
            default:
                System.out.println("Please  Enter choice between 1-4");
        }
    }

}
