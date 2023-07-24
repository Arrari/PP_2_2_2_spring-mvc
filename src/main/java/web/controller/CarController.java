package web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars() {
        CarService carService = new CarServiceImpl();
        //adding cars
        carService.addCar(new Car("model1", 1000, 1));
        carService.addCar(new Car("model1", 1500, 2));
        carService.addCar(new Car("model2", 2500, 1));
        carService.addCar(new Car("model2", 2300, 2));
        carService.addCar(new Car("model3", 3400, 4));

        //list of cars
        System.out.println(carService.getNumCars(4));

        return "cars";
    }
}
