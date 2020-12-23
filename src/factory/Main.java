package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.createShape(ShapeEnum.SQUARE);
        square.draw();

        Shape circle = shapeFactory.createShape(ShapeEnum.CIRCLE);
        circle.draw();


        //java methods

        Boolean aTrue = Boolean.valueOf("False");
        System.out.println(aTrue);

    }
}
