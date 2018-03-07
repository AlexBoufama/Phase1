import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.*;
import java.text.BreakIterator;
import java.util.*;

public class Restaurant {

//    public void checkStorage() {
//        for (Ingredient i : inventory) {
//            if (i.OutOfStorage()) {
//                //write request;
//            }
//        }
//    }

    public static void main(String[] args) throws IOException {
        /**
         * This is the menu creation/initialization
         */
        ArrayList<Ingredient> inventory = new ArrayList<Ingredient>();
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        ArrayList<Table> tables = new ArrayList<Table>();
        ArrayList<Server> servers = new ArrayList<Server>();
        ArrayList<Cook> cooks = new ArrayList<Cook>();
        ArrayList<Manager> managers = new ArrayList<Manager>();
        ArrayList<Order> orders = new ArrayList<Order>();

        Server server0 = new Server(0);
        servers.add(server0);
        Server server1 = new Server(1);
        servers.add(server1);
        Server server2 = new Server(2);
        servers.add(server2);

        Cook cook0 = new Cook(0);
        cooks.add(cook0);
        Cook cook1 = new Cook(1);
        cooks.add(cook1);
        Cook cook2 = new Cook(2);
        cooks.add(cook2);

        Manager manager0 = new Manager(0);
        managers.add(manager0);
        Manager manager1 = new Manager(1);
        managers.add(manager1);

        String InventoryFile = "Inventory.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(InventoryFile))) {
            String line = fileReader.readLine();
            while (line != null) {
                String[] subStrings = line.split(" \\| ");
                inventory.add(new Ingredient(subStrings[1], Integer.valueOf(subStrings[2]),
                        Integer.valueOf(subStrings[3])));
                line = fileReader.readLine();
            }
        }

        String MenuFile = "Menu.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(MenuFile))) {
            String line = fileReader.readLine();
            while (line != null) {
                String[] subStrings = line.split(" \\| ");
                MenuItem item = new MenuItem(subStrings[1], Integer.valueOf(subStrings[2]));
                menu.add(item);

                for(int i = 3; i < subStrings.length; i++){
                    item.addIngredients(inventory.get(Integer.valueOf(subStrings[i])));
                }

                line = fileReader.readLine();
            }
        }

        String TablesFile = "Tables.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(TablesFile))) {
            String line = fileReader.readLine();
            while (line != null) {
                tables.add(new Table(Integer.valueOf(line)));
                line = fileReader.readLine();
            }
        }

        try (BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = "EventsTest.txt";
            String userInput;
            do {
                try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                    System.out.print("Press Enter to Start: ");
                    userInput = keyboard.readLine();

                    if (userInput.equals("exit")) {
                        System.out.println("Exiting...");
                        break;
                    }

                    String line = fileReader.readLine();
                    String[] subStrings = line.split(" \\| ");
                    System.out.println("Hello");
                    System.out.println(subStrings[1]);
                    System.out.println(subStrings[2]);
                    System.out.println(subStrings[3]);
                    System.out.println(subStrings[4]);
                    System.out.println(subStrings[5]);
                    System.out.println(subStrings[6]);
                    System.out.println(subStrings[7]);
                    if(subStrings[7].contains("+")){
                        String[] modifications = subStrings[7].split(" \\+ ");
                        System.out.println(modifications[0]);
                        System.out.println(modifications[1]);
                    }
                    orders.add(new Order(tables.get(Integer.parseInt(subStrings[2].substring(subStrings[2].length() - 1))),
                            Integer.parseInt(subStrings[0].substring(subStrings[0].length() - 1))));
                    System.out.println(orders.get(0));
                    orders.get(0).addItem(menu.get(0));
                    orders.get(0).addItem(menu.get(0));
                    orders.get(0).addItem(menu.get(1));
                    System.out.println(orders.get(0));
                    System.out.println(menu.get(4).getIngredients());




                    while (line != null) {
                        /**String[] subStrings = line.split(" \\| ");
                        if(subStrings[2].equals("order seen")){

                        }
                        else if(subStrings[2].equals("order filled")){

                        }
                        else if(subStrings[2].equals("order delivered")){

                        }
                        else if(subStrings[2].equals("addBill")){

                        }
                        else if(subStrings[2].equals("return")){

                        }
                        else{
                            orders.add(new Order(tables.get(Integer.parseInt(subStrings[2].substring(subStrings[2].length() - 1))),
                                    Integer.parseInt(subStrings[0].substring(subStrings[0].length() - 1))));
                        }

                        for(int i = 0; i < subStrings.length; i++) {

                            if(i == 3) {

                            }
                        }


                        if (subStrings[1].equals(" s1 ")) {
                            Server server = servers.get(Integer.valueOf(subStrings[1].substring(1, 3)));
                            if (subStrings[2].equals(" 1 ")) {
                                ArrayList<MenuItem> orderItems = new ArrayList<MenuItem>();
                                String[] OI = subStrings[4].split(",");
                                for (String item : OI) {
                                    for (MenuItem menuItem : menu) {
                                        if (menuItem.toString().equals(item.substring(1))) {
                                            orderItems.add(menuItem);
                                        }
                                    }
                                }
                                //server.createOrder(orderItems, tables.get(Integer.valueOf(subStrings[3].substring(1))));
                                System.out.println(server.createOrder(orderItems, tables.get(Integer.valueOf(subStrings[3].substring(1)))));
                            }*/
                        }

                    }
                }while(!userInput.equals("exit"));
            }//while(!userInput.equals("exit"));
        }
    }
