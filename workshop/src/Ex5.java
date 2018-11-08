import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        double firstNumber = readNumberFromConsole(1);
        double secondNumber = readNumberFromConsole(2);

        String sign = readSignFromConsole(1);

        double finalResult = result(sign, firstNumber, secondNumber);

        System.out.println(finalResult);
    }

    static double result(String sign, double firstNumber, double secondNumber) {
        double resultAction = 0.0;
        switch (sign) {
            case "+":
                resultAction = firstNumber + secondNumber;
                return resultAction;
            case "-":
                resultAction = firstNumber - secondNumber;
                return resultAction;
            case "*":
                resultAction = firstNumber * secondNumber;
                return resultAction;
            case "/":
                resultAction = firstNumber / secondNumber;
                return resultAction;
            default:
        }
        return resultAction;
    }


    static double readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextDouble();
    }

    static String readSignFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak: " + numberInOrder);
        return scanner.next();
    }

}
