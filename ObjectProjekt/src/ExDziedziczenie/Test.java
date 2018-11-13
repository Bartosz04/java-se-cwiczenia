package ExDziedziczenie;

public class Test {
    public static void main(String[] args) {
            // tworzenie kwadratu
    /*    Square sqare = new Square("czerowny", 12);
            // dzieki dziedziczeniu po prostokacie, dla kwadratu mozna wyliczyc pole
        System.out.println("Pole kwadratu= "+sqare.countArea());
            // kwadrat rowniez dziedziczy kolor od figury dzieki prostokatowi
        System.out.println("Kolor kwadratu: "+sqare.getColor());


            //tworzenie prostokata
        Rectangle rectangle = new Rectangle("Zielony", 12,43);
            // dzieki dziedziczeniu po figurze mozemy wyswietlic kolor
        System.out.println("Kolor: "+rectangle.getColor()+" Obwod prostokata = "+rectangle.perimeter());
*/
        //sqare.setA(5);
        //rectangle.setA(5);


        // Osobna czesc kodu  AB
        Square myRect = new Square("red", 10);
        Rectangle mySquare = new Rectangle("black",10,20);
        Triangle myTriangle = new Triangle("Yellow", 15, 12);

        Figure[] figures = new Figure[3];
        figures[0] = myRect;
        figures[1] = mySquare;
        figures[2] = myTriangle;

        double area = 0.0;
        for (Figure figure : figures){
            area += figure.countArea();
        }

        System.out.println("Area of all fields: "+area);
        //koniec czesci AB


        //czesc do equals
       /* Square smallSquare = new Square("czerowny", 12);
        Square bigSqare = new Square("czerowny", 12);

        if (smallSquare.equals(bigSqare)){
            System.out.println("sa rowne");
        } else {
            System.out.println("nie sa rowne");
        }*/

    }
}
