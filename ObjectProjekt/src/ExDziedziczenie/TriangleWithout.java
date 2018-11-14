package ExDziedziczenie;

import Exception.InvalidSideExeption;

public class TriangleWithout implements  AreaaCountaablee{

    double w;
    double e;

    public TriangleWithout (double w, double e)  {



        this.w = w;
        this.e = e;
    }

    public double getW() {
        return w;
    }

    public double getE() {
        return e;
    }

    public double countArea(){
        return  (w*e)/2;
    }


}
