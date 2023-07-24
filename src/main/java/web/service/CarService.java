package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    void addCar(Car car);

    Car getCar(int carInt);

    int carListLength();

    List<Car> getNumCars(int num);

}
