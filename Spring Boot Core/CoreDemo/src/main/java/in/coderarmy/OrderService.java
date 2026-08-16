package in.coderarmy;

import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.PopUpNotification;
import in.coderarmy.notification.SmsService;

public class OrderService {

    NotificationService notification;

    OrderService(NotificationService notification){
        this.notification = notification;
    }

    OrderService(){

    }

    public void placeOrder(){
        System.out.println("Order placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
