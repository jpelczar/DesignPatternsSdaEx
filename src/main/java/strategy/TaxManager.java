package strategy;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {

    private static Map<CountryCode, TaxStrategy> startegies =
            new HashMap<>();

    static {
        startegies.put(CountryCode.PL, new PLTax());
        startegies.put(CountryCode.US, new USATax());
    }

    public static TaxStrategy getStrategy(CountryCode countryCode) {
//        if (countryCode == CountryCode.PL) {
//            return new PLTax();
//        } else {
//            return new USATax();
//        }
        return startegies.get(countryCode);
    }

    public static float calculateTax(CountryCode countryCode,
                                     float income) {
        return getStrategy(countryCode).calculate(income);
    }
}