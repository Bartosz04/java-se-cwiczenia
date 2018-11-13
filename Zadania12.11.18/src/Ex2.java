import java.util.Scanner;

/*
        Zaimplementuj program obliczający podany element ciągu Fibonacciego w sposób nieiteracyjny
        (bez używania instrukcji for, while, do-while).
 */

public class Ex2 {
    public static void main(String[] args) {
        int firstNumber = readNumberFromConsole(1);
        System.out.println(score(firstNumber));
    }

    static int score (int firstNumber){
        int  result;
        if(firstNumber>1){
            return score(firstNumber-1)+score(firstNumber-2);
        }
        else if(firstNumber==1){
            result = 1;
            return result;
        }
        else {
            result =0;
            return result;
        }
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();
    }
}
