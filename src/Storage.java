import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Storage<T> {
        ArrayList<T> items = new ArrayList<>();
        LinkedList<T> history = new LinkedList<>();
    void add(T element){
        items.add(element);
        history.add(element);
    }
    boolean remove(T element) {
        boolean removed = items.remove(element);
        if (removed) {
            history.add((T)(Object)("removed: " + element));
        }
        return removed;
    }
    HashMap<T, Integer> statistics() {
        HashMap<T, Integer> stats = new HashMap<>();

        for (T item : items) {
            stats.put(item, stats.getOrDefault(item, 0) + 1);
        }

        return stats;
    }
    LinkedList<T> getHistory() {
        return history;
    }
}


