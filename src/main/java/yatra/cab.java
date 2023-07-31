package yatra;

import org.springframework.web.bind.annotation.GetMapping;

public class cab {
    @GetMapping("/mycab")
    public String getData(){
        return "Please book your cab";
    }
    
}
