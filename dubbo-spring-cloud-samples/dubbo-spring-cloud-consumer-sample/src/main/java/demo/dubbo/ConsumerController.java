package demo.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangqingqing
 * @description:
 * @date : 2020-02-08 22:09
 * @history 2020-02-08 22:09 huangqingqing create.
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/consumer1")
    public String consumer() {
        return restTemplate.getForObject("http://dubbo-provider1/home", String.class);
    }

    @GetMapping("/havecode")
    public String havecode() {
        return restTemplate.getForObject("http://dubbo-rest-provider1/demo/havecode", String.class);
    }
}
