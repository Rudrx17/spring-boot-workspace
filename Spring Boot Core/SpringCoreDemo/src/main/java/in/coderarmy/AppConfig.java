package in.coderarmy;

import in.coderarmy.payment.CardPayment;
import in.coderarmy.payment.PaymentService;
import in.coderarmy.payment.UpiPayment;
import in.strikes.CartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("in.coderarmy")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User(20,"Rudraksh");
    }

    @Bean
    public CartService createCartService(){
        return new CartService();
    }

    @Bean
    //@Primary
    @Qualifier("cp")
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
    @Qualifier("upi")
    public PaymentService createUpiPayment(){
        return new UpiPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("upi") PaymentService paymentService){
        return new OrderService(paymentService);
    }

}
