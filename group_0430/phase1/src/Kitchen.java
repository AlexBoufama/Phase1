import java.util.*;

public class Kitchen {

    public void checkStorage(){
        for (Ingredient i : inventory){
            if (i.OutOfStorage()){
                //write request;
            }
        }
    }
}
