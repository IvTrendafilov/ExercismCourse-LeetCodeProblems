import java.util.List;



interface RemoteControlCar {
    //
    void drive();

    public int getDistanceTravelled();
}

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance;
    private int vitories;

    @Override
    public void drive() {
        int speed = 10;
        this.distance += speed;

        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.drive() method");
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getDistanceTravelled() method");
    }

    public int getNumberOfVictories() {
        return this.vitories;
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.vitories = numberofVictories;
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }


    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.getNumberOfVictories() < o.getNumberOfVictories() ? -1 : 1;
        /*  if (this.getNumberOfVictories() < o.getNumberOfVictories()){
            return -1;
        }else if(this.getNumberOfVictories() == o.getNumberOfVictories()){
            return 0;
        }else {
            return 1;
        }*/
    }
}


class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distance;

    @Override
    public void drive() {
        int speed = 20;
        this.distance += speed;
        //throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.drive() method");
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
        //throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.getDistanceTravelled() method");
    }
}

class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
        //throw new UnsupportedOperationException("Please implement the (static) TestTrack.race() method");
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {

        if (prc1.compareTo(prc2) < 0) {
            return List.of(prc1, prc2);
        } else {
            return List.of(prc2, prc1);
        }
        //throw new UnsupportedOperationException("Please implement the (static) TestTrack.getRankedCars() method");
    }
}


