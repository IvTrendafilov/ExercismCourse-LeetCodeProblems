
public class ElonsToyCar {

    private int distance = 0;
    private int batteryPercentage = 100;

    public static ElonsToyCar buy() {

        return new ElonsToyCar();
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
    }

    public String distanceDisplay() {

        return "Driven " + distance + " meters";
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";

        }
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distance += 20;
            batteryPercentage -= 1;
        }
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
    }

    public static void main(String[] args) {

        ElonsToyCar elonsToyCar = new ElonsToyCar();
        System.out.println(elonsToyCar.distanceDisplay());
        System.out.println(elonsToyCar.batteryDisplay());
        for (int i = 0; i < 100; i++) {
            elonsToyCar.drive();
        }
        elonsToyCar.drive();

        System.out.println(elonsToyCar.distanceDisplay());
        System.out.println(elonsToyCar.batteryDisplay());


    }
}
