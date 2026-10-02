package gradle;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("DevOps Calculator");
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("5 * 3 = " + multiply(5, 3));
    }
}