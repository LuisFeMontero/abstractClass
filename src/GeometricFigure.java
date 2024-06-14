public abstract class GeometricFigure {

    private Integer sides;

    public GeometricFigure(Integer sides) {
        this.sides = sides;
    }
    public abstract Double calculateArea();
}
