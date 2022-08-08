import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {
    private long second = (long) Math.pow(10,9);
    private LocalDateTime dates;
    public Gigasecond(LocalDate moment) {
        this.dates = moment.atStartOfDay();
        System.out.println(this.dates);
        /*long add = (long) ((((Math.pow(10,9))/60)/60)/24);
        System.out.println(add);
        System.out.println(moment);
        moment = moment.plusDays(add);
        System.out.println(moment);*/

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    }

    public Gigasecond(LocalDateTime moment) {
        this.dates = moment;
        System.out.println(moment);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return;
    }

    public LocalDateTime getDateTime() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        //return null;
        return dates.plusSeconds(second);
    }

    public static void main(String[] args) {
        Gigasecond first = new Gigasecond(LocalDateTime.of(2011, Month.APRIL, 25, 12,56));

    }
}
