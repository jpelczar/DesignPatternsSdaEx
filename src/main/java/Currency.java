public enum Currency {
    PLN(5f), EUR(4f), USD(1f);

    float toUsd;

    Currency(float toUsd) {
        this.toUsd = toUsd;
    }

    void printToUsd() {
        System.out.println(toUsd);
    }
}
