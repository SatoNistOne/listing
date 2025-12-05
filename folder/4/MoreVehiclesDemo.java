class Vehicle12 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance(double interval) {
        return maxspeed * interval;
    }
}

class MoreVehiclesDemo {
    public static void main(String[] args) {

        Vehicle12 car1 = new Vehicle12();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        Vehicle12 bus1 = new Vehicle12();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        double interval = 1.25;
        double distanceCar = car1.distance(interval);
        double distanceBus = bus1.distance(interval);

        System.out.print("car1 может проехать ");
        System.out.print(distanceCar + " км с " + car1.passengers);
        System.out.println(" пассажирами.");
        System.out.print("bus1 может проехать ");
        System.out.print(distanceBus + " км с " + bus1.passengers);
        System.out.println(" пассажирами.");
    }
}
