package homeworks.hw21;

import homeworks.hw21.burgersenum.BurgerSize;
import homeworks.hw21.burgersenum.Ingredient;
import homeworks.hw21.burgersenum.MeatType;
import homeworks.hw21.burgersexceptions.BurgerIngredientException;
import homeworks.hw21.burgersexceptions.BurgerSizeException;
import homeworks.hw21.burgersexceptions.BurgerTypeException;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger {
    static int basePrice = 10;
    final BurgerSize burgerSize;
    final MeatType meatType;
    ArrayList<Ingredient> ingredients;

    public int finalPrice() {
        int ingredientsResult = 0;
        for (Ingredient ingredient : ingredients) {
            ingredientsResult += ingredient.getIngredientPrice();
        }
        return ingredientsResult + basePrice + burgerSize.getSizePrice() + meatType.getMeatPrice();
    }

    public Burger(BurgerSize burgerSize, MeatType meatType, ArrayList<Ingredient> ingredients) {
        this.burgerSize = burgerSize;
        this.meatType = meatType;
        this.ingredients = ingredients;
    }


    public void burgerInfo() {
        System.out.println("Your burger size is: " + StringUtils.capitalize(burgerSize.name().toLowerCase()));
        System.out.println("Your meat type is: " + StringUtils.capitalize(meatType.name().toLowerCase()));
        System.out.print("Your ingredients are: ");
        for (Ingredient ingredient : ingredients) {
            System.out.print(StringUtils.capitalize(ingredient.name().toLowerCase()) + " ");
        }
        System.out.println();
        System.out.println("Final price: " + finalPrice());
    }

        public static Burger createBurgerByInput () throws BurgerSizeException, BurgerTypeException, BurgerIngredientException {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello, this is Burger Constructor." + '\n' +
                    "Please, choose your burger size: SMALL, MEDIUM, LARGE");

            BurgerSize size;
            String inputSize = scanner.next().toUpperCase();

            switch (inputSize){
                case "SMALL", "MEDIUM", "LARGE" -> size = BurgerSize.valueOf(inputSize);
                default -> throw new BurgerSizeException(inputSize);
            }

            System.out.println("Please, choose the type of meat: BEEF, CHICKEN, FISH");
            MeatType meatType;
            String inputMeatType = scanner.next().toUpperCase();
            switch (inputMeatType){
                case "BEEF", "CHICKEN", "FISH" -> meatType = MeatType.valueOf(inputMeatType);
                default -> throw new BurgerTypeException(inputMeatType);
            }

            ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
            System.out.println("Please, choose ingredients CHEESE, TOMATO, LETTUCE. " +
                    "When you have finished your selection - enter the word 'Done'");
            while (scanner.hasNext()){
                String inputIngredient = scanner.next().toUpperCase();
                if (inputIngredient.equals("CHEESE") || inputIngredient.equals("TOMATO") || inputIngredient.equals("LETTUCE")) {
                    selectedIngredients.add(Ingredient.valueOf(inputIngredient));
                } else if (inputIngredient.equals("DONE")) {
                    System.out.println("Your order has been successfully accepted");
                    System.out.println();
                    break;
                } else {
                    throw new BurgerIngredientException(inputIngredient);
                }
            }
            return new Burger(size, meatType, selectedIngredients);
        }
    }
