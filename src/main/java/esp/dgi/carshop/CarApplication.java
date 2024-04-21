package esp.dgi.carshop;

import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CarApplication {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(CarApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
        logger.info("Car app started! Goto http://localhost:8081/takkino31");

    }
}

@RestController
@RequestMapping("/takkino31")
class CarController {

    @Value("${fullname:Elimane}")
    private String fullname;

    @GetMapping("/fullname")
    String getFullname() {
        return "Let's talk about YAYA: " + this.fullname + "!";
    }
}
