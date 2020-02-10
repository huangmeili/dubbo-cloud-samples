package dubbo;


import dubbo.api.DefaultCalculateService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangqingqing
 * @description:
 * @date : 2020-02-08 19:56
 * @history 2020-02-08 19:56 huangqingqing create.
 */
@SpringBootApplication
@RestController
public class DemoApplication {

    @Reference
    private DefaultCalculateService defaultCalculateService;

/*    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoApplication.class)
                .properties("spring.profiles.active=nacos")
                .run(args);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/consumer")
    public String consumer(){
        return defaultCalculateService.haveCode();
    }

}
