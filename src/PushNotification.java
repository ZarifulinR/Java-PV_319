public class PushNotification extends Notification{
    String  deviceId;

    public PushNotification(String recipient, String deviceId) {
        super(recipient);
        this.deviceId = deviceId;
    }

    @Override
    public void send() {
        System.out.println("Push на устройство "+deviceId);
    }
}
