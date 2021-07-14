package homework5.backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int capasity;
    private final int maxCapacity;
    private List<Items> itemsPack;

    public Backpack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        itemsPack = new ArrayList<>();
    }


    public int getCapasity() {
        return capasity;
    }

    public void addItemsPack(Items items){
        if(maxCapacity - (capasity + items.getWeight())<0){
           return;
        }
        capasity += items.getWeight();
        itemsPack.add(items);
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "itemsPack=" + itemsPack +
                '}';
    }
}
