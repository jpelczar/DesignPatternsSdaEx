package pizzapasta.pizza;

import pizzapasta.Pizza;

import java.util.Arrays;
import java.util.List;

public class CapriciosaPizza implements Pizza {
    @Override
    public String getName() {
        return "Capriciosa";
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("Ser", "Sos pomidorowy", "Pieczarki");
    }
}
