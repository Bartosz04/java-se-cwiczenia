
        //
public abstract class Figure {

    // protected - nie pozwala nadpisywac ale pozwala dziedziczycw innych class
    protected String color;

    public Figure(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
