package lessons.lesson17.sorting.comparator;

import java.util.Comparator;

public class Car implements Comparator<Car> {
    private String model;

    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }



    @Override
    public int compare(Car o1, Car o2) {
        return 0;
    }

/*    @Override
    public int compareTo(Car newCar) {
        if(this.year == newCar.year ){
            return 0;
        } else if (this.year < newCar.year){
            return 1;
        } else {
            return -1;
        }
    }*/


}
