package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> carList;

    @Override
    public void addCar(Car car) {
        if (carList == null) {
            this.carList = new ArrayList<>();
            carList.add(car);
        } else {
            carList.add(car);
        }

    }

    @Override
    public Car getCar(int carInt) {
        return carList.get(carInt - 1);
    }

    @Override
    public int carListLength() {
        return carList.size();
    }

    @Override
    public List<Car> getNumCars(int num) {
        if (num > 1) {
            return carList.subList(0, num - 1);
        }
        return null;
    }
}
