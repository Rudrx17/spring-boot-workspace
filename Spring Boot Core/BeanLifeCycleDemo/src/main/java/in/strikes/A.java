package in.strikes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class A {
    B b;

    public A(B b){
        this.b = b;
    }

    @PostConstruct
    public void setB(){
        b.setA(this);
    }
}
