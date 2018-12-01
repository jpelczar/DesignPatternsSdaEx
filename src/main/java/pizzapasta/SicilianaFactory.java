package pizzapasta;

import pizzapasta.pasta.CarbonaraPasta;
import pizzapasta.pizza.MargerithaPizza;

public class SicilianaFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {
        if ("MARGERITHA".equalsIgnoreCase(name)) {
            return new MargerithaPizza();
        }
        return null;
    }

    @Override
    Pasta orderPasta(String name) {
        if ("Carbonara".equalsIgnoreCase(name)) {
            return new CarbonaraPasta();
        }
        return null;
    }
}
