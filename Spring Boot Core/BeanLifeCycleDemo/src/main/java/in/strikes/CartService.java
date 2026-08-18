package in.strikes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements BeanNameAware, ApplicationContextAware
        /* implements InitializingBean , DisposableBean */{

    Map<Integer,String> mp;

    public CartService(){
       mp = new HashMap<>();
        System.out.println("CartService constructor called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context name is " + applicationContext.getClass());
    }

    @PostConstruct
    public void start2(){
        System.out.println("Bean is ready");
        mp.put(1,"Rudraksh");
        mp.put(2,"Ishwari");
    }

    public void addToCart(){
        System.out.println("Added to cart");
    }

    public String getValue(int key){
        return mp.get(key);
    }

    @PreDestroy
    public void stop2(){
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }

//    public void stop(){
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }


//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is ready");
//        mp.put(1,"Rudraksh");
//        mp.put(2,"Ishwari");
//    }

//    public void start(){
//        System.out.println("Bean is ready");
//        mp.put(1,"Rudraksh");
//        mp.put(2,"Ishwari");
//    }

}
