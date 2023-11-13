package homeworks.hw21.burgersexceptions;

public class BurgerTypeException extends  Exception{

    private String message;

    public BurgerTypeException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BurgerTypeException{" +
                "Your burger was not created because you entered an incorrect value " + message + '\'' + " of type " +
                '}';
    }
}
