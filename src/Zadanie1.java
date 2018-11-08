import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        //Podstawy

        Scanner in = new Scanner(System.in);
  /*      System.out.println("Podaj pierwsza liczbe:");
        Double firstNumber = in.nextDouble();
        System.out.println("Podaj druga liczbe:");
        Double secondNumber = in.nextDouble();
        System.out.println("Podaj trzecia liczbe:");
        Double thirdNumber = in.nextDouble();

        System.out.println("Pierwsza: "+firstNumber+" Druga: "+secondNumber+" Trzecia: "+thirdNumber);

        Double sredniaArytmetyczna = (firstNumber + secondNumber + thirdNumber)/3;
        System.out.println("Srednia arytmetyczna = "+sredniaArytmetyczna);

        //Logika
        // 1.
        System.out.println("Podaj liczbe:");
        int liczba = in.nextInt();
        if(liczba >=0){
            System.out.println("Wartosc bezwzgledna: "+liczba);
        }else{
            liczba *= -1;
            System.out.println("Wartosc bezwzgledna: "+liczba);
        }
        //2.
        System.out.println("Podaj pierwsza liczbe:");
        int pierwszLiczba = in.nextInt();
        System.out.println("Podaj druga liczbe:");
        int drugaLiczba = in.nextInt();
        System.out.println("Podaj trzecia liczbe:");
        int trzeciaLiczba = in.nextInt();

        if(pierwszLiczba>drugaLiczba && pierwszLiczba>trzeciaLiczba){
            System.out.println("Najwieksza liczba to: "+pierwszLiczba);
        } else if(drugaLiczba>pierwszLiczba && drugaLiczba>trzeciaLiczba){
            System.out.println("Najwieksza liczba to: "+drugaLiczba);
        } else if (trzeciaLiczba>pierwszLiczba && trzeciaLiczba>drugaLiczba){
            System.out.println("Najwieksza liczba to: "+trzeciaLiczba);
        } else if (pierwszLiczba==drugaLiczba && pierwszLiczba==trzeciaLiczba){
            System.out.println("Wszystkie liczby sa rowne ");
        } else if (pierwszLiczba==drugaLiczba && pierwszLiczba>trzeciaLiczba){
            System.out.println("Najwieksza liczba to: "+pierwszLiczba+" "+drugaLiczba);
        } else if (pierwszLiczba==trzeciaLiczba && pierwszLiczba>drugaLiczba) {
            System.out.println("Najwieksza liczba to: " + pierwszLiczba + " " + trzeciaLiczba);
            // } else (drugaLiczba==trzeciaLiczba && drugaLiczba>pierwszLiczba){
        } else {
            System.out.println("Najwieksza liczba to: "+drugaLiczba+" "+trzeciaLiczba);
        }
// Petle ciag Fibonacciego

        System.out.println("Podaj liczbe nie ujemna:");
        int liczba1 = in.nextInt();

        int fn1 = 0;
        int fn2 = 1;
        int wynik = 0;

        if(liczba1<0){
            System.out.println("bledna liczba");
        } else if (liczba1 == 0){
            System.out.println("Wynik "+liczba1);

        }else if(liczba1 == 1){
            System.out.println("wynik "+liczba1);
        }else {
            for (int i =2; i<=liczba1; i++) {
                wynik = fn1 + fn2;
                fn1 = fn2;
                fn2 = wynik;
            }
            System.out.println("Wynik dla "+liczba1+" wynosi: "+wynik);
        }

//Petla suma kwadratow

        System.out.println("Podaj liczbe nie ujemna :");
        int liczba2 = in.nextInt();

        int wynik2 = 0;

        if(liczba2<0){
            System.out.println("bledna liczba");
        } else {
            for(int i=0;i<liczba2;i++){
                wynik2 = i *i;
                System.out.println("suma kwadratow "+wynik2);
            }

            //System.out.println("suma kwadratow "+wynik2);
        }
*/
        //kalkulator

    /*    System.out.println("Podaj liczbe:");
        Double x = in.nextDouble();

        System.out.println("Podaj liczbe:");
        Double y = in.nextDouble();

        System.out.println("Co chcesz wykonac + dodaj, - odejmij, * mnozenie, / dzielenie");
        String z =in.next();

        Double wynik3 = 0.0;

        switch(z){
            case "+":
                wynik3 = x + y;
                System.out.println("Wynik dodawania "+wynik3);
                break;
            case "-":
                wynik3 = x - y;
                System.out.println("Wynik dodawania "+wynik3);
                break;
            case "*":
                wynik3 = x * y;
                System.out.println("Wynik dodawania "+wynik3);
                break;
            case "/":
                wynik3 = x / y;
                System.out.println("Wynik dodawania "+wynik3);
                break;
            default:
                break;
        }
*/
        System.out.println("Podaj liczbe: ");
        int t = in.nextInt();

        int[] tablica = {2, 4, 6, 8, 10};
        int length = tablica.length;
        //int[] tablicaZnalezione = {0, 0, 0, 0, 0};
        int count =0;

        int remove =-1;

        int wynik =0;
        int wielkosc =0;


        for(int i =0;i<5;i++) {
            for (int j = 1; j < 5; j++) {

                wynik = tablica[i] + tablica[j];

                if ((i != j) && (i < j) && (wynik == t)) {
                    // w = tablica[i] + tablica[j];

                    System.out.println("spelnia warunek " + tablica[i]);
                    System.out.println("spelnia warunek " + tablica[j]);

                    // count ++;

                    //dodanie wartosci w odpowiedni indeks

                    // tablicaZnalezione[i] = tablica[j];

              /*  int a= j- count;

                System.out.println("count "+count);
                tablicaZnalezione[a] = tablica[j]; */
            /*    for( i =0;i<5;i++) {
                    System.out.println("znalezione " + tablicaZnalezione[i]);
                }
            }*/

                }

           /* if(t==w){
                System.out.println("do usuniecia"+tablica[i]);
            }
            else{
                System.out.println("koniec");
            }*/
            }

        }
        if (remove > 0){
            for(int i =0; i<length -1;i++){
                if (i < remove){
                }
                else{
                    tablica[i] = tablica[i+1];
                }
            }
        tablica[length]=0;
            length--;

            for(int i=0;i<length;i++){
                System.out.println(tablica[i]+" ");
            }
            System.out.println();

        }

    }

    }

