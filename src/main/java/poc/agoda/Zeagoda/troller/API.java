package poc.agoda.Zeagoda.troller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    @GetMapping("/")
    public String checkSoem(){
        return "Connected";
    }
}
