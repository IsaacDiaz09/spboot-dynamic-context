package dev.isadiape.multiple_contexts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {
        "dev.isadiape.multiple_contexts.core"
})
@ImportResource({"classpath:context/service-${app.context-type}.xml"})
public class SpbootMultipleAppcontextsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbootMultipleAppcontextsApplication.class, args);
    }

}
