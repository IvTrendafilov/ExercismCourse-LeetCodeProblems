public class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int speed;
    private int batteryDrain;
    private int remainingBattery = 100;
    private int distanceDriven = 0;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;

    }

    public boolean batteryDrained() {
            /*if (this.remainingBattery < batteryDrain){
                return true;
            }else{
                return false;
            }*/
        return this.remainingBattery < batteryDrain ? true : false;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
        return distanceDriven;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven += speed;
            this.remainingBattery -= batteryDrain;
        }
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
        //throw new UnsupportedOperationException("Please implement the RaceTrack.tryFinishTrack() method");
    }
}
