package SpringTest;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App{

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);

    }
}
