package in.strikes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton") //@Scope("singleton") - Lazy initialization. @Scope("singleton") - does eager initialization and it's default scope
public class OrderService {

    public OrderService(){
        System.out.println("OrderService created");
    }

    public void placeOrder(){
        System.out.println("Order placed");
    }
}
