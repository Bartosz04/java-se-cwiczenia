import java.util.Arrays;
import java.util.Scanner;

public class ExHome1 {

    public static void main(String[] args) {
        int tabel[] = {2, 4, 6, 8, 10};
        int[] tableFound = {0, 0, 0, 0, 0};

        System.out.println("Podaj liczbe:");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();

        int length = tabel.length;

        int[] newTabel = new int[length -1];

        int sum = 0;
        int count =0;

        for (int i = 0; i < length -1; i++) {
            for (int j = 1; j < length; j++) {
                sum = tabel[i] + tabel[j];
                if ((i != j) && (i < j) && (sum == number)) {
                    System.out.println("wartosc i: " + tabel[i]);
                    System.out.println("wartosc j: " + tabel[j]);

                    count++;
                    System.out.println("ile liczb "+count);


                /*    int found = j;

                    System.out.println(found);

                    tabel=new int[length-1];

                   for (i = 0; i < found; i++) {
                        tabel[i] = tabel[i];

                    }
                    for (i = found; i < length - 1; i++) {
                        tabel[i] = tabel[i + 1];
                    }
                    System.out.println(Arrays.toString(tabel));

                    length--;
*/
                }
            }
        }





        }

    }


