import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        float a = scanner.nextFloat();

        System.out.println("Введите число b:");
        float b = scanner.nextFloat();

        System.out.println("Введите операцию (/, *, +, -):");
        Scanner operation = new Scanner(System.in);
        String CharOperation = operation.nextLine();

        float answer = 0;

        switch (CharOperation) {
            case "/": 
                answer = a / b;
                break;
            case "*": 
                answer = a * b;
                break; 
            case "+": 
                answer = a + b;
                break;
            case "-": 
                answer = a - b;
                break;
            default: 
                System.out.println("Некорректная операция");
                break;
        }
        System.out.println("Ответ: " + answer);

        scanner.close();
        operation.close();
    }
}