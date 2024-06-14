public class Circle extends GeometricFigure{

    private Double diameter;

    public Circle(Double diameter) {
        super(0);
        this.diameter = diameter;
    }

    @Override
    public Double calculateArea() {
        return Math.pow(getRadio(),2) * Math.PI;
    }

    public Double getRadio() {
        return diameter/2;
    }

}
