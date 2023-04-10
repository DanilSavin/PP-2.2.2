package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao{
    private List<Car> cars = new ArrayList<>();
     {
        cars.add(new Car("Bmw", 7, 1));
        cars.add(new Car("Jeep", 70, 2));
        cars.add((new Car("Uaz", 150, 3)));
        cars.add(new Car("Gaz", 66, 4));
        cars.add(new Car("Audi", 8, 5));
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}

