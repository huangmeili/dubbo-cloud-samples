package demo.dubbo;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangqingqing
 * @description:
 * @date : 2020-02-08 19:56
 * @history 2020-02-08 19:56 huangqingqing create.
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
