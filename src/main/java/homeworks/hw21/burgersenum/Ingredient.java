package homeworks.hw21.burgersenum;

public enum Ingredient {
    CHEESE(4),
    TOMATO(5),
    LETTUCE(7);

    int ingredientPrice;

    Ingredient(int ingredientPrice) {
        this.ingredientPrice = ingredientPrice;
    }

    public int getIngredientPrice() {
        return ingredientPrice;
    }
}
