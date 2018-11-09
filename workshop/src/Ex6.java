import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        int firstNumber = readNumberFromConsole(1);
        int[] table = {1,2,3,4,5,6,7,8,9,10};
        int[] tableFound = {-1, -1, -1, -1, -1,-1, -1, -1, -1, -1};
        int length = table.length;

        int count = check(table, firstNumber, tableFound, length);


        System.out.println(Arrays.toString(tableFound));

        int[] finalTables = finalTable(table, tableFound, length, count);

        System.out.println(Arrays.toString(finalTables));


    }

    static int check(int[] table, int firstNumber, int[] tableFound, int length) {
        int count = 0;
        int sum = 0;
        int found = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length; j++) {
                sum = table[i] + table[j];
                if (firstNumber == sum && i != j && i < j) {
                    tableFound[j] = table[j];
                    found = table[j];
                    System.out.println("znaleziona liczba; " + found);
                    count += 1;
                }
            }
        }
        return count;
    }

    static int[] finalTable(int[] table, int[] tableFound, int length, int count) {
        int[] finalTable1 = new int[length - count];
        int finalTableIterator = 0;
        for (int i = 0; i < length; i++) {
            boolean shouldAdd = true;
            for (int j = 0; j < tableFound.length; j++) {
                if (table[i] == tableFound[j]) {
                    shouldAdd = false;
                }
            }
            if (shouldAdd) {
                finalTable1[finalTableIterator++] = table[i];
            }
        }
        return finalTable1;
    }


    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: " + numberInOrder);
        return scanner.nextInt();
    }

}
