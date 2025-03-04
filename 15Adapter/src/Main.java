

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();
        date.setDay(1);
        date.setMonth(1);
        date.setYear(2020);
        System.out.println(date.getDate());

        date.advanceDays(5);

        System.out.println(date.getDate());


    }
}
