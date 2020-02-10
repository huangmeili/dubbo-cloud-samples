package demo.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangqingqing
 * @description:
 * @date : 2020-02-08 20:43
 * @history 2020-02-08 20:43 huangqingqing create.
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@RefreshScope
public class ConsumerApplication {
    @Value("${test.value:0}")
    private String app;
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
    @GetMapping("/get")
    public String get() {
        return app;
    }
}
