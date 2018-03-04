import java.util.*;

public class Kitchen {
    public ArrayList<Ingredient> inventory;

    public void checkStorage(){
        for (Ingredient i : inventory){
            if (i.OutOfStorage()){
                //write request;
            }
        }
    }
}
