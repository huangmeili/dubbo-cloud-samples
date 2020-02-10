package dubbo.rest.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author huangqingqing
 * @description:
 * @date : 2020-02-08 19:56
 * @history 2020-02-08 19:56 huangqingqing create.
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
public class ProviderRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderRestApplication.class, args);
    }
}
