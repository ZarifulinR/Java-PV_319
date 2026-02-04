public class DataLoadedHandler implements DataloadetListener {

    @Override
    public void dataLoadet(DataLoadEvent event) {
        System.out.println("Handler recived listener"+ event.getData());
    }
}
