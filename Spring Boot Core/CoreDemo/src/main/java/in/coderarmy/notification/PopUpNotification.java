package in.coderarmy.notification;

public class PopUpNotification implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Pop-up notification sent");
    }
}
