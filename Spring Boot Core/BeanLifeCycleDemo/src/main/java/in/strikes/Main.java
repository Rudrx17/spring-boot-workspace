package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

          ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        UserService user = context.getBean(UserService.class);
//        // this line will call the function but the name of the actual bean will not change
//        user.setBeanName("userBean2");
//
//        AppConfig config = context.getBean(AppConfig.class);
//        config.demo();

//        CartService cart = context.getBean(CartService.class);
//        System.out.println(cart.getValue(2));
//
//        context.close();




    }
}
