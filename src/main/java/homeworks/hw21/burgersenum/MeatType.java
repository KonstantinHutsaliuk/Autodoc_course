package homeworks.hw21.burgersenum;

public enum MeatType {
    BEEF(10),
    CHICKEN(5),
    FISH(15);

    int meatPrice;

    MeatType(int meatPrice) {
        this.meatPrice = meatPrice;
    }

    public int getMeatPrice() {
        return meatPrice;
    }
}
