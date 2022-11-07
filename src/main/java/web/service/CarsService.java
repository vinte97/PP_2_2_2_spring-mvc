package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarsService {

    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW M3", 777, 2007));
        carList.add(new Car("Audi S4", 444, 1999));
        carList.add(new Car("Mazda MX5", 555, 1989));
        carList.add(new Car("Ford Mustang V", 575, 1993));
        carList.add(new Car("Toyota mark II", 222, 1994));
    }

    public List<Car> getCarList() {
        return carList.stream().toArray()
    }

}
