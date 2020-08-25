package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public ArrayList<MenuItem> listOfFood;
    private Date lastUpdate;

    public Menu(String lastUpdate){
       this.listOfFood = new ArrayList<>();
       this.lastUpdate = new Date();
    }

}
