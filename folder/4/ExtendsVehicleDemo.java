class Vehicle8 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle8() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }

    Vehicle8(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        return maxspeed * interval;
    }

    int getMaxSpeed() {
        return maxspeed;
    }

    int getWheels() {
        return wheels;
    }
}
