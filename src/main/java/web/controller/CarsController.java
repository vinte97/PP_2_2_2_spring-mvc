package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String getCars() {
        return "cars";
    }
}
