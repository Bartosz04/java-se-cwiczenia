public class OOP {
    public static void main(String[] args) {


        /*
        // tworzenie tablicy Diamond i uzupelnienie jej
        Diamond[] diamonds = new Diamond[10];

        for (int i =0; i<10; i++){
            diamonds[i] = new Diamond(i,i);
        }
        */
/*
        // obsluga Diamond
        Diamond smallDiamond = new Diamond(10.0, 15.0,5.0);
        Diamond bigDiamond = new Diamond(5.0);

        System.out.println("Pole malego rombu: "+smallDiamond.countArea());
        System.out.println("Pole duzego rombu: "+bigDiamond.countArea());

        smallDiamond.icrementE();
        System.out.println("Pole malego rombu: "+smallDiamond.countArea());
        System.out.println("Pole duzego rombu: "+bigDiamond.countArea());
        */

        Rectangle smallRectangle = new Rectangle(10, 20);
        //System.out.println("Pole prostokata o wymiarach"+);
        Rectangle bigRectangle = new Rectangle(5, 15);




        System.out.println("Pole malego prostokata: "+smallRectangle.countArea());
        System.out.println("Obwod malego prostokata: "+smallRectangle.perimeter());

        System.out.println("Pole duzego prostokata: "+bigRectangle.countArea());
        System.out.println("Obwod duzego prostokata: "+bigRectangle.perimeter());



    }
}
