import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int number = readNumberFromConsole(1);



    }


    static int numberCheck (int number, int variableOne, int variableTwo){
        if(number>=0){
        } else {





        }
        System.out.println(number);
        return number;
    }



    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: "+ numberInOrder);
        return scanner.nextInt();
    }
}
