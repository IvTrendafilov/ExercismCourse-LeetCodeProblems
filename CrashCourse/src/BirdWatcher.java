public class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
    }

    public int getToday() {
        if(birdsPerDay.length < 1) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length-1];
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {

         birdsPerDay[birdsPerDay.length - 1]++;
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        boolean yes = false;
        for (int i: birdsPerDay){
            if (i == 0){
                yes = true;
            }
        }
        return yes;
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res = 0;
        if (birdsPerDay.length < numberOfDays){
            numberOfDays = birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++){
            res+= birdsPerDay[i];
        }
        return res;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int res = 0;
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5){
                res+=1;
            }
        }
        return res;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
    public static void main(String[] args){
        BirdWatcher bird = new BirdWatcher(new int[]{1,2,3,4,5,8,7,9,0});
        System.out.println(bird.getBusyDays());
        System.out.println(bird.getCountForFirstDays(10));
    }
}
