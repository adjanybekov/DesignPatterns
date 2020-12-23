package factory;

public class ShapeFactory {
    Shape createShape(ShapeEnum shape) {
        if (shape == ShapeEnum.CIRCLE) {
            return new Circle();
        } else if (shape == ShapeEnum.SQUARE) {
            return new Square();
        }
        return null;
    }
}
