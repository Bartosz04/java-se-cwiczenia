package ExDziedziczenie;

public class Square extends Rectangle {

    //dziedziczy wszystko po prostokacie
    public Square(String color, double a) {
        // wpisanie do super w takiej kolejnosci jak ma to zapisane Rectangle
        super(color, a, a);
    }

    //nadpisanie - override
    @Override
    public void setA(double a) {
        System.out.println("Set w kwadracie");
        this.a = a;
        this.b = a;
    }

    @Override
    public void setB(double b) {

        this.a = b;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Square) {
            Square squareToCompare = (Square) obj;
            if (this.a == squareToCompare.a &&
                    this.b == squareToCompare.b) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}