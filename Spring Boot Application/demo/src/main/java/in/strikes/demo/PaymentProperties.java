package in.strikes.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("payment-property")
public class PaymentProperties {

    private String type;
    private int retryCount;
    private boolean enabled;
    private int timeout;

    public void setType(String type) {
        this.type = type;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getType() {
        return type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getTimeout() {
        return timeout;
    }

}
