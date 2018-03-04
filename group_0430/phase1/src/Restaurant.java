import java.io.*;
import java.text.BreakIterator;
import java.util.*;

public class Restaurant {
    public static void main(String[] args) {
        /**
         * This is the menu creation/initialization
         */

        Ingredient rice = new Ingredient("rice",20,10);
        Ingredient seaweed = new Ingredient("seaweed",20, 10);
        Ingredient crabMeat = new Ingredient("crabMeat",20, 10);
        Ingredient mayo = new Ingredient("mayo",20,10);
        Ingredient avocado = new Ingredient("avocado",20,10);
        Ingredient cucumber = new Ingredient("cucumber",20,10);
        Ingredient tempura = new Ingredient("tempura",20,10);
        Ingredient salmon = new Ingredient("salmon",20,10);
        Ingredient wasabi = new Ingredient("wasabi",20,10);
        Ingredient tuna = new Ingredient("tuna",20,10);
        Ingredient soySauce = new Ingredient("soySauce",20,10);
        Ingredient hot = new Ingredient("hot",20,10);


        MenuItem californiaRoll = new MenuItem("californiaRoll", 12);
        californiaRoll.addIngredients(rice);
        californiaRoll.addIngredients(seaweed);
        californiaRoll.addIngredients(crabMeat);
        californiaRoll.addIngredients(mayo);
        californiaRoll.addIngredients(avocado);
        californiaRoll.addIngredients(cucumber);

        MenuItem dynamiteRoll = new MenuItem("dynamiteRoll", 15);
        dynamiteRoll.addIngredients(rice);
        dynamiteRoll.addIngredients(seaweed);
        dynamiteRoll.addIngredients(tempura);
        dynamiteRoll.addIngredients(mayo);
        dynamiteRoll.addIngredients(cucumber);
        dynamiteRoll.addIngredients(salmon);

        MenuItem nigiri = new MenuItem("nigiri", 10);
        nigiri.addIngredients(salmon);
        nigiri.addIngredients(wasabi);
        nigiri.addIngredients(rice);

        MenuItem sashimi = new MenuItem("sashimi", 20);
        sashimi.addIngredients(salmon);
        sashimi.addIngredients(tuna);
        sashimi.addIngredients(wasabi);
        sashimi.addIngredients(soySauce);

        MenuItem sake = new MenuItem("sake", 15);
        sake.addIngredients(hot);








        File file = new File("Events.txt");
    }
}
