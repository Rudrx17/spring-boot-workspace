package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");

        //get bean by name/id
        //OrderService order = (OrderService) context.getBean("orderService");

        //get bean by type
        //OrderService order = context.getBean(OrderService.class);

//        OrderService orderService = context.getBean("orderService",OrderService.class);
//
//        orderService.placeOrder();

        UserService user = context.getBean(UserService.class);
        context.close();

    }
}
