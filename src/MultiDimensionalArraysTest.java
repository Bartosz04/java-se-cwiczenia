public class MultiDimensionalArraysTest {
    public static void main(String[] args) {
        int [][] gameBoard = new int [10][5];

        //inicjalizacja

   /*     for(int i=0; i<10;i++){
            gameBoard[i] = new int[5];
            for (int j=0; j <5; j++){
                gameBoard[i][j] =j;
            }
        }   */

        //wypisanie

        for(int i =0; i < 10; i++){
            for(int j =0; j < 5; j++){
                System.out.println(gameBoard[i][j]);
            }
            System.out.println();
        }

    }
}
