package ExDziedziczenie;

public class Triangle extends Figure {

    double c;
    double h;

    public Triangle(String color,double c, double h) {
        super(color);
        this.c = c;
        this.h = h;
    }

    public double countArea(){
        return  (c*h)/2;
    }


}
