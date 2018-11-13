package ExDziedziczenie;

public class Rectangle extends Figure {

    protected double a;
    public double b;


        //dziedziczy kolor po figurze

    public Rectangle(String color,double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }


    public double countArea(){
        return  a * b;
    }

    public double perimeter(){
        return multiply(2, a) + multiply(2, b);
    }

    private double multiply(double a, double b){
        return a*b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        System.out.println("Set w prostokacie");
        this.a = a;
    }
}
