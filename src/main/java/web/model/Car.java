package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private long id;

    public Car(String model, int series, long id) {
        this.model = model;
        this.series = series;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && id == car.id && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, id);
    }
}
