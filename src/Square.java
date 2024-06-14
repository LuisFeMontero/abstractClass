public class Square extends GeometricFigure{

    private Double sideLength;

    public Square(Double sideLength) {
        super(4);
        this.sideLength = sideLength;
    }

    @Override
    public Double calculateArea() {
        return sideLength * sideLength;
    }
}
