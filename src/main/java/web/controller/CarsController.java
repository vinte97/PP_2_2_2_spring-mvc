package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import web.models.Car;
import web.service.CarsService;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String getCars(@ModelAttribute("car") Car car) {

    }
}
