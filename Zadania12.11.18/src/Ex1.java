import java.util.Scanner;

/*      Napisz program, który poda rozwiązania równania kwadratowego. Równanie powinno mieć postać ax^2 + bx + c = 0.
        W zależności od podanych współczynników a, b i c program powinien wyświetlić
        wszystkie rozwiązania (2, 1, lub informacje o braku rozwiązań rzeczywistych).
 */


public class Ex1 {
    public static void main(String[] args) {


        int firstNumber = readNumberFromConsole(1);
        int secondNumber = readNumberFromConsole(2);
        int thirdNumber = readNumberFromConsole(3);

        System.out.println("Delta wynosi: "+delta(firstNumber,secondNumber,thirdNumber));

        System.out.println("Rozwiazania: "+deltaComparison(delta(firstNumber,secondNumber,thirdNumber),firstNumber,secondNumber));
    }

    static int delta(int firstNumber, int secondNumber, int thirdNumber){
        int delta = (secondNumber*secondNumber) - 4*(firstNumber*thirdNumber);
        return delta;
    }

    static String deltaComparison(int delta,int firstNumber, int secondNumber){
        String result;
        if(delta>0){
            double x1=0;
            double x2=0;
            x1=(-secondNumber-Math.sqrt(delta))/(2*firstNumber);
            x2=(-secondNumber+Math.sqrt(delta))/(2*firstNumber);
            result ="x1 = "+Double.toString(x1)+"   x2 = "+Double.toString(x2);
            return result;
        }
        else if(delta==0){
            double x=0;
            x=(-secondNumber)/(2*firstNumber);
            result = Double.toString(x);
            return result;
        }
        else{
            result = "Nie ma rozwiazania";
            return result;
        }
    }


    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();
    }
}
