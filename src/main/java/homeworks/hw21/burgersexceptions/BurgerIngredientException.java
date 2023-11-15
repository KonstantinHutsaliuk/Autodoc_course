package homeworks.hw21.burgersexceptions;

public class BurgerIngredientException extends Exception{
    private String message;

    public BurgerIngredientException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BurgerIngredientException{" +
                "Your burger was not created because you entered an incorrect value " + message  + " of ingredient " +
                '}';
    }
}
