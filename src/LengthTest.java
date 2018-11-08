

public class LengthTest {
    public static void main(String[] args) {
        double coordinateX1 = 127.89;
        double coordinateY1 = 92.12;

        double coordinateX2 = 24.12;
        double coordinateY2 = 82.91;

       // double a = (coordinateX2 - coordinateX1);
       // double b = (coordinateY2 - coordinateY1);



        double power1 = Math.pow((coordinateX2 - coordinateX1),2); // liczba podniesiona do potegi
        double power2 = Math.pow((coordinateY2 - coordinateY1),2);

        //double sqrt = Math.sqrt(power1 + power2);    // pierwiastek z liczby

        double sqrt = Math.sqrt(Math.pow((coordinateX2 - coordinateX1),2) + Math.pow((coordinateY2 - coordinateY1),2));
        // wynik 104,...

        System.out.println(sqrt);

    }
}
