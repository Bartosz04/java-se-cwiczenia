import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        double firstNumber = readNumberFromConsole(1);
        int[] table = {2, 4, 6, 8, 10};
        int[] tableFound = {0, 0, 0, 0, 0};

        int foundA = check(table,firstNumber,tableFound);

        for(int i =0;i<5;i++) {
            System.out.println(Arrays.toString(tableFound));
        }
    }

    static int check (int[] table, double firstNumber, int[] tableFound){
        int count=0;
        int sum =0;
        int found=0;
        for(int i =0;i<5;i++) {
                sum = table[i] + table[i+1];
                //found = table[i+1];

                tableFound[count] = table[i+1];
            count+=1;
           // return tableFound[i+1];
            return 0;
        }
        return 0;
       // return tableFound[];
    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();
    }

}
