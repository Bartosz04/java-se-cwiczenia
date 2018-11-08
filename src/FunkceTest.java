public class FunkceTest {
    public static void main(String[] args) {

        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] xCoordinates = {5, 6, 7, 8, 9};

        int xCoordinatesSum = countSumOfElements(xCoordinates);
        int yCoordinatesSum = countSumOfElements(yCoordinates);

        System.out.println("Suma Y to: "+yCoordinatesSum);
        System.out.println("Suma X to: "+xCoordinatesSum);

        double xSrednia = srednia(xCoordinates);
        double ySrednia = srednia(yCoordinates);

        System.out.println("Srednia Y to: "+ySrednia);
        System.out.println("Srednia X to: "+xSrednia);

    }

        static int countSumOfElements(int[] inputArray) {
            int sum =0;
            for (int i=0; i < inputArray.length; i++){
                sum += inputArray[i];
            }
            return sum;
        }

        static double countVelocity(double time, double route){

            double velocity = route / time;
            System.out.println(velocity);

            return velocity;
        }

        // countAvgOfElements

        static double srednia(int[] inputArray){
            double sum1 =(double) countSumOfElements(inputArray);
            return sum1/ inputArray.length;

            // moje roziazanie zamiast return
            //int ilosc = inputArray.length;
            //double srednia1 = sum /ilosc;
            //return srednia1;
        }

    }

