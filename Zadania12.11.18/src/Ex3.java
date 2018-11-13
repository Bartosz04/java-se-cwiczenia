import java.util.Scanner;

/*
        Napisz metodę, która jako argument przyjmie trzy liczby.
        Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.

 */

public class Ex3 {
    public static void main(String[] args) {
        int firstNumber = readNumberFromConsole(1);
        int secondNumber = readNumberFromConsole(2);
        int thirdNumber = readNumberFromConsole(3);
        System.out.println(triangle(firstNumber,secondNumber,thirdNumber));
    }


    static String triangle (int firstNumber, int secondNumber, int thirdNumber){

        double a = Math.pow(firstNumber,2);
        double b = Math.pow(secondNumber,2);
        double c = Math.pow(thirdNumber,2);

        if((a+b)==c || (b+c)==a || (c+a)==b){
            return "Trojkat prostokatny";
        }

        else {
            return "Nie jest to trojkat prostokatny";
        }
    }


    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();
    }
}