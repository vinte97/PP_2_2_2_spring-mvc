package web.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class CarsService {


    private List<Car> carList;
    public int count;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW M3", 777, 2007));
        carList.add(new Car("Audi S4", 444, 1999));
        carList.add(new Car("Mazda MX5", 555, 1989));
        carList.add(new Car("Ford Mustang V", 575, 1993));
        carList.add(new Car("Toyota mark II", 222, 1994));
        count = carList.size();
    }

    public List<Car> getCarList(int count) {
        if (count >=5) {
            return carList.stream().collect(Collectors.toList());
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}


