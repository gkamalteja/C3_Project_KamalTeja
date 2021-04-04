import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private int price;
    private List<Item> ItemList = new ArrayList<Item>();

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }

}
