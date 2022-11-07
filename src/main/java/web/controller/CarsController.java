package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {

    private CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "5", value = "count") int count,
                          Model model) {
        if (count >= 3) {
            model.addAttribute("cars", carsService.getCarList());
        } else {
            model.addAttribute("cars", carsService.getCarList(count));
        }
        return "cars";
    }

}
