package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;

    private String color;

    private int speed;

    public List<Car> carList;

    public Car() {
    }

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car param:" +
               "model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", speed=" + speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
