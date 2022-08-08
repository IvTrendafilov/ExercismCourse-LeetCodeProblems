public class CarsAssemble {
    public static double productionRatePerHour(int speed) {
        double res = speed;
        if (speed >= 1 && speed <= 4){
            res = res*221;
        } else if (speed >= 5 && speed <= 8) {
            res = res*221*90/100;

        }else if(speed == 9){
            res = (res*221)*80/100;
        } else if (speed ==10) {
            res = res*221*77/100;
        }
        return res;
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRateperHour() method");
    }

    public int workingItemsPerMinute(int speed) {

        double res = speed;
        if (speed >= 1 && speed <= 4){
            res = res*221/60;
        } else if (speed >= 5 && speed <= 8) {
            res = res*221*90/100/60;

        }else if(speed == 9){
            res = (res*221)*80/100/60;
        } else if (speed ==10) {
            res = res*221*77/100/60;
        }
        return (int)res;

        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }

    public static void main(String[] args){
        System.out.println(productionRatePerHour(8));
    }
}
