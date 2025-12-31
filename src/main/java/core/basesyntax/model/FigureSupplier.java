package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), new Random().nextInt(25));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), new Random().nextInt(25), new Random().nextInt(25));
            case 2:
                return new Square(colorSupplier.getRandomColor(), new Random().nextInt(25));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), new Random().nextInt(25), new Random().nextInt(25));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), new Random().nextInt(25), new Random().nextInt(25), new Random().nextInt(25));
            default:
                break;
        }

        return getDefaultFigure();
    }
}
