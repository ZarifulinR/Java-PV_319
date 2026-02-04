

import java.util.EventObject;

public class DataLoadEvent extends EventObject {
    private String data;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public DataLoadEvent(Object source,String data) {
        super(source);
        this.data=data;
    }
    public String getData(){
        return data;
    }
}
