import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Meetup {
    public enum MeetupSchedule {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        LAST,
        TEENTH
    }
    private final int month;
    private final int year;
    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }
    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schedule) {
        LocalDate date = LocalDate.of(year, month, 1);
        return switch (schedule) {
            case FIRST -> date.with(TemporalAdjusters.dayOfWeekInMonth(1, dayOfWeek));
            case SECOND -> date.with(TemporalAdjusters.dayOfWeekInMonth(2, dayOfWeek));
            case THIRD -> date.with(TemporalAdjusters.dayOfWeekInMonth(3, dayOfWeek));
            case FOURTH -> date.with(TemporalAdjusters.dayOfWeekInMonth(4, dayOfWeek));
            case LAST -> date.with(TemporalAdjusters.lastInMonth(dayOfWeek));
            case TEENTH -> date.with(new TeenthAdjuster(dayOfWeek));
        };
    }
    private static class TeenthAdjuster implements TemporalAdjuster {
        private final DayOfWeek dayOfWeek;
        TeenthAdjuster(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }
        @Override
        public Temporal adjustInto(Temporal temporal) {
            LocalDate date = LocalDate.from(temporal);
            while (date.getDayOfMonth() < 13) {
                date = date.with(TemporalAdjusters.next(dayOfWeek));
            }
            return date;
        }
    }

    public static void main(String[] args){


    }
}
