package web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    private List<Car> carList = new ArrayList<>();
    //adding cars



    @GetMapping(value = "/cars")
    public String printCarsCars(@RequestParam(value = "count", required = false, defaultValue = "0") int count, Model model) {
        carService.addCar(new Car("model1", 1000, 1));
        carService.addCar(new Car("model1", 1500, 2));
        carService.addCar(new Car("model2", 2500, 1));
        carService.addCar(new Car("model2", 2300, 2));
        carService.addCar(new Car("model3", 3400, 4));
        if (count!= 0 && count < 5) {
            model.addAttribute("carList", carService.getNumCars(count));
            System.out.println(carService.getNumCars(count));
        } else {
            model.addAttribute("carList", carService.getNumCars(5));
            System.out.println(carService.getNumCars(5));
        }

        return "cars";
    }


}
