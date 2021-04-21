package top.PotatoRice.mallapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author loorzve
 */
@MapperScan(basePackages = {"top.PotatoRice.mallapi.mapper"})
@SpringBootApplication
public class MallApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallApiApplication.class, args);
    }

}
