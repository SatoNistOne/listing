class Vehicle13 {
    int passengers = 4;
    int wheels = 4;
    int maxspeed = 160;
    int burnup = 13;

    @Override
    public String toString() {
        return "Vehicle(passengers=" + passengers + ", wheels=" + wheels +
                ", maxspeed=" + maxspeed + ", burnup=" + burnup + ")";
    }
}

class Auto1 extends Vehicle13 {
    boolean sunroof;

    Auto1(boolean sunroof) {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 200;
        this.burnup = 12;
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return super.toString() + ", sunroof=" + sunroof;
    }
}

public class PolyVehicleDemo {
    public static void main(String[] args) {
        Auto1 a = new Auto1(true);
        Vehicle13 v = new Vehicle13();

        Vehicle13[] pvd = {a, v};

        for (int i = 0; i < pvd.length; i++) {
            System.out.println(pvd[i].toString());
        }
    }
}
