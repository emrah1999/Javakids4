package lesson38Solid;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Square square = new Square();

        CalcShape calcShape = new CalcShape();
        calcShape.calcArea(shape);
        calcShape.calcArea(square);

    }
}
