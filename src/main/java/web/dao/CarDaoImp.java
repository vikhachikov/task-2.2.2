package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> listCars() {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Car1", "Black", 1));
        cars.add(new Car("Car2", "White", 2));
        cars.add(new Car("Car3", "Red", 3));
        cars.add(new Car("Car4", "Pink", 4));
        cars.add(new Car("Car5", "Brown", 5));

        return cars;
    }
}
