import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;
    private Table table;
    private boolean Confirmed = false;
    private boolean Filled = false;
    private boolean Delivered = false;
    private int orderNumber;

    public Order(Table table, int orderNumber) {
        this.table = table;
        this.orderNumber = orderNumber;
        this.items = new ArrayList<MenuItem>();
    }

    public void addItem(MenuItem food){
        items.add(food);
    }

    public void Confirm(){
        Confirmed = true;
    }

    public void Fill(){
        Filled = true;
    }

    public void Deliver(){
        Delivered = true;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean isFilled() {
        return Filled;
    }

    public String toString(){
        String s = "Order " + orderNumber + ": ";

        for (MenuItem menuItem : items) {
            s = s + menuItem.toString() + " | ";
        }

        return s;
    }

}
