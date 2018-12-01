package pizzapasta;

public class FactoryProducer {

    public static AbstractFactory getFactory(String name) {
        if ("Torino".equalsIgnoreCase(name)) {
            return new TorinoFactory();
        }
        if ("Siciliana".equalsIgnoreCase(name)) {
            return new SicilianaFactory();
        }
        return null;
    }

}
