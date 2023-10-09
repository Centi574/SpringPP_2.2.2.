package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carlist;

    {
        carlist = new ArrayList<>();
        carlist.add(new Car("One", "Black", 2));
        carlist.add(new Car("Two", "White", 5));
        carlist.add(new Car("Three", "Green", 7));
        carlist.add(new Car("Four", "Blue", 8));
        carlist.add(new Car("V", "Black", 11));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 5) {
            return carlist.subList(0, count);
        } else {
            return carlist;
        }
    }
}
