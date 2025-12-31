package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private String[] color = new String[] {"blue", "red", "yellow", "orange", "white"};

    public String getRandomColor() {
        int index = new Random().nextInt(color.length);
        return color[index];
    }
}
