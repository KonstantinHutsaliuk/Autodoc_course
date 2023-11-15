package homeworks.hw21.burgersenum;

public enum BurgerSize {
    SMALL(5),
    MEDIUM(10),
    LARGE(15);

    int sizePrice;

    BurgerSize(int sizePrice) {
        this.sizePrice = sizePrice;
    }

    public int getSizePrice() {
        return sizePrice;
    }
}
