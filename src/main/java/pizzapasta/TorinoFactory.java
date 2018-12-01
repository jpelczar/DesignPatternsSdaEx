package pizzapasta;

import pizzapasta.pasta.Pasta2;
import pizzapasta.pizza.CapriciosaPizza;
import pizzapasta.pizza.MargerithaPizza;

public class TorinoFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {
        if ("Capriciosa".equalsIgnoreCase(name)) {
            return new CapriciosaPizza();
        }
        if ("Margeritha".equalsIgnoreCase(name)) {
            return new MargerithaPizza();
        }
        return null;
    }

    @Override
    Pasta orderPasta(String name) {
        if ("2".equalsIgnoreCase(name)) {
            return new Pasta2();
        }
        return null;
    }
}
