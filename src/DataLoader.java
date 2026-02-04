import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    List<DataloadetListener> listeners = new ArrayList<>();
    public void addDataLoaded(DataloadetListener listener){
        listeners.add(listener);
    }
    public void removeDataLoader(DataloadetListener listener) {
        listeners.remove(listener);
    }
    private void  fireDataLoaded(String data){
        DataLoadEvent event = new DataLoadEvent(this,data);
        for (DataloadetListener listener : listeners){
            listener.dataLoadet(event);
        }

    }
    public void loadData(){
        String loadData = "This is data";
        System.out.println(("Data loaded"+ loadData));
        fireDataLoaded(loadData);
    }
}
