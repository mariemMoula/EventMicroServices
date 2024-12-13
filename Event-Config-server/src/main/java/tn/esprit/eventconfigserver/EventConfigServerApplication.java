package tn.esprit.eventconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EventConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventConfigServerApplication.class, args);
    }

}
