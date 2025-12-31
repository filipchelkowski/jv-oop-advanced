package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
        double a = random.nextInt(25);
        double b = random.nextInt(25);
        double c = random.nextInt(25);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), a);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), a, b);
            case 2:
                return new Square(colorSupplier.getRandomColor(), a);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), a, b);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), a, b, c);
            default:
                break;
        }

        return getDefaultFigure();
    }
}
