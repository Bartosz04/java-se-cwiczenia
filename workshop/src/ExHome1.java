import  java.util.Arrays;
import java.util.Scanner;

public class ExHome1 {

    public static void main(String[] args) {
        int tabel[] = {2,4,6,8,10};
        int tabelEmpty[] = {0,0,0,0,0};

        System.out.println("Podaj liczbe:");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();

        int sum =0;
        int count =0;

        for(int i =0;i<5;i++){
            for(int j =1;j<5;j++){
                sum = tabel[i]+tabel[j];
                if ((i != j) && (i < j) && (sum == number)){
                    System.out.println("wartosc i: "+tabel[i]);
                    System.out.println("wartosc j: "+tabel[j]);
                    count++;
                    tabelEmpty[j]=tabel[j];
                    System.out.println(Arrays.toString(tabelEmpty));
                }
            }
        }




    }

}
