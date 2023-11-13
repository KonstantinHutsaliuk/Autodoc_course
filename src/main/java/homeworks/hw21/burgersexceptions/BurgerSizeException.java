package homeworks.hw21.burgersexceptions;

public class BurgerSizeException extends Exception {
    private String message;

    public BurgerSizeException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BurgerSizeException{" +
                "Your burger was not created because you entered an incorrect value " + message  + " of size " +
                '}';
    }
}
