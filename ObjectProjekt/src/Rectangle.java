public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double countArea(){
        return  a * b;
    }

    public double perimeter(){
        return multiply(2, a) + multiply(2, b);
    }


    // ukrywamy przed reszta - private, uzywane jest tylko w tej klasie
    private double multiply(double a, double b){
        return a*b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
