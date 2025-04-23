import java.util.ArrayList;

public class SmartBox<T> {

    private ArrayList<T> items = new ArrayList<>();


    public void addItem(T item) {
        this.items.add(item);
    }

    public ArrayList<T> getItem() {
        return this.items;
    }
}
