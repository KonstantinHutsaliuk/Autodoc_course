package homeworks.hw21;

import homeworks.hw21.burgersexceptions.BurgerIngredientException;
import homeworks.hw21.burgersexceptions.BurgerSizeException;
import homeworks.hw21.burgersexceptions.BurgerTypeException;

import static homeworks.hw21.Burger.createBurgerByInput;

public class Launcher {
    public static void main(String[] args) throws BurgerSizeException, BurgerTypeException, BurgerIngredientException {
        Burger burger = createBurgerByInput();
        burger.burgerInfo();
    }


}
