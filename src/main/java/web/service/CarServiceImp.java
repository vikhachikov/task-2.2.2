package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> listCars(int count) {

        List<Car> cars = carDao.listCars();

        if (count <=cars.size() && count >= 0) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }

        return cars;
    }
}
