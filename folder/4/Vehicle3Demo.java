class Vehicle3 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle3() {
        this(4, 4, 160, 13);
    }

    Vehicle3(int passengers, int wheels, int maxspeed,
             int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(int interval) {
        return distance((double) interval);
    }

    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    }
}

public class Vehicle3Demo {
    public static void main(String[] args) {
        Vehicle3 car = new Vehicle3(2, 4, 130, 30);
        Vehicle3 bus = new Vehicle3(45, 4, 100, 25);

        double interval = 1.25;

        System.out.println("Автомобиль с " + car.passengers + " пассажирами проедет "
                + car.distance(interval) + " км.");
        System.out.println("Автобус с " + bus.passengers + " пассажирами проедет "
                + bus.distance(interval) + " км.");
    }
}
