package io.wegetit.elmer.logproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource("classpath:application.properties")
public class ElmerLogProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElmerLogProducerApplication.class, args);
    }
}
