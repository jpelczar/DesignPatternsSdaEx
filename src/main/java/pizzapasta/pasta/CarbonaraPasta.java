package pizzapasta.pasta;

import pizzapasta.Pasta;

public class CarbonaraPasta implements Pasta {
    @Override
    public String getName() {
        return "Carbonara";
    }

    @Override
    public String getPastaType() {
        return "Car Type";
    }
}
