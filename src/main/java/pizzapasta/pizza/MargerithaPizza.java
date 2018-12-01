package pizzapasta.pizza;

import pizzapasta.Pizza;

import java.util.Arrays;
import java.util.List;

public class MargerithaPizza implements Pizza {
    @Override
    public String getName() {
        return "Margeritha";
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("Ser", "Sos pomidorowy");
    }
}
