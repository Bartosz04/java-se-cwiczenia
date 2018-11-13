public class Diamond extends Figure {

    private double e;
    private double f;

    //przeciazanie
    private double a;

    //konstruktor
    public Diamond(double e, double f, double a, String color){

        // wywolanie konstruktora (o jeden wyzej)
        // jeden super i laczenie konstruktorow
        super("Czerwony");
        // super(color);

        this.e =e;
        this.f =f;
        this.a =a;
        //dziedziczenie color z Figure
        //this.color = "czerwony";

    }

    public Diamond(double a, String color){

        // wywolanie
        // this(a/10.0,a/5.0,a,color);


        super("Czerwony");

        this.a = a;
        e= a/10;
        f =a/5;
    }



    double countArea(){
        return e * f;
    }

    void icrementE(){
        e++;
    }
}
