import java.io.*;
import java.text.BreakIterator;
import java.util.*;

public class Restaurant {

    public ArrayList<Ingredient> inventory;
    public ArrayList<MenuItem> menu;
    public ArrayList<Table> tables;
    public ArrayList<Server> servers;
    public ArrayList<Cook> cooks;
    public ArrayList<Manager> managers;


    public void checkStorage() {
        for (Ingredient i : inventory) {
            if (i.OutOfStorage()) {
                //write request;
            }
        }
    }

    public static void main(String[] args) {
        /**
         * This is the menu creation/initialization
         */

        Ingredient rice = new Ingredient("rice",20,10);
        inventory.add(rice);
        Ingredient seaweed = new Ingredient("seaweed",20, 10);
        inventory.add(seaweed);
        Ingredient crabMeat = new Ingredient("crabMeat",20, 10);
        inventory.add(crabMeat);
        Ingredient mayo = new Ingredient("mayo",20,10);
        inventory.add(mayo);
        Ingredient avocado = new Ingredient("avocado",20,10);
        inventory.add(avocado);
        Ingredient cucumber = new Ingredient("cucumber",20,10);
        inventory.add(cucumber);
        Ingredient tempura = new Ingredient("tempura",20,10);
        inventory.add(tempura);
        Ingredient salmon = new Ingredient("salmon",20,10);
        inventory.add(salmon);
        Ingredient wasabi = new Ingredient("wasabi",20,10);
        inventory.add(wasabi);
        Ingredient tuna = new Ingredient("tuna",20,10);
        inventory.add(tuna);
        Ingredient soySauce = new Ingredient("soySauce",20,10);
        inventory.add(soySauce);
        Ingredient sake = new Ingredient("sake",20,10);
        inventory.add(sake);


        MenuItem californiaRoll = new MenuItem("californiaRoll", 12);
        californiaRoll.addIngredients(rice);
        californiaRoll.addIngredients(seaweed);
        californiaRoll.addIngredients(crabMeat);
        californiaRoll.addIngredients(mayo);
        californiaRoll.addIngredients(avocado);
        californiaRoll.addIngredients(cucumber);
        menu.add(californiaRoll);

        MenuItem dynamiteRoll = new MenuItem("dynamiteRoll", 15);
        dynamiteRoll.addIngredients(rice);
        dynamiteRoll.addIngredients(seaweed);
        dynamiteRoll.addIngredients(tempura);
        dynamiteRoll.addIngredients(mayo);
        dynamiteRoll.addIngredients(cucumber);
        dynamiteRoll.addIngredients(salmon);
        menu.add(dynamiteRoll);

        MenuItem nigiri = new MenuItem("nigiri", 10);
        nigiri.addIngredients(salmon);
        nigiri.addIngredients(wasabi);
        nigiri.addIngredients(rice);
        menu.add(nigiri);

        MenuItem sashimi = new MenuItem("sashimi", 20);
        sashimi.addIngredients(salmon);
        sashimi.addIngredients(tuna);
        sashimi.addIngredients(wasabi);
        sashimi.addIngredients(soySauce);
        menu.add(sashimi);

        MenuItem hotSake = new MenuItem("hotSake", 15);
        sake.addIngredients(sake);
        menu.add(hotSake);

        Table table1 = new Table(1);
        tables.add(table1);
        Table table2 = new Table(2);
        tables.add(table2);
        Table table3 = new Table(3);
        tables.add(table3);
        Table table4 = new Table(4);
        tables.add(table4);
        Table table5 = new Table(5);
        tables.add(table5);
        Table table6 = new Table(6);
        tables.add(table6);
        Table table7 = new Table(7);
        tables.add(table7);
        Table table8 = new Table(8);
        tables.add(table8);
        Table table9 = new Table(9);
        tables.add(table9);
        Table table10 = new Table(10);
        tables.add(table10);

        Server server1 = new Server(1);
        servers.add(server1);
        Server server2 = new Server(2);
        servers.add(server2);
        Server server3 = new Server(3);
        servers.add(server3);

        Cook cook1 = new Cook(1);
        cooks.add(cook1);
        Cook cook2 = new Cook(2);
        cooks.add(cook2);
        Cook cook3 = new Cook(3);
        cooks.add(cook3);

        Manager manager1 = new Manager(1);
        managers.add(manager1);
        Manager manager2 = new Manager(2);
        managers.add(manager2);

        File file = new File("Events.txt");
    }
}
