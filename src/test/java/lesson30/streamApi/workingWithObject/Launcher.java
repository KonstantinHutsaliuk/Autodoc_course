package lesson30.streamApi.workingWithObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Launcher {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tesla", 2020));
        carList.add(new Car("Opel", 2012));
        carList.add(new Car("Seat", 1990));
        carList.add(new Car("VW", 2023));
        carList.add(new Car("Audi", 2003));

        Stream<Car> carStream = carList.stream().filter(x -> x.getYear() > 2012)
                .filter(x -> !"VW".equalsIgnoreCase(x.getModel()));

        carStream.forEach(x -> System.out.println(x.getModel()));
    }

}
