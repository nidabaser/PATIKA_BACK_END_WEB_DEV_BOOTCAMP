/**
 * @author Nida Başer
 * April 2024
 */
public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int day;

    Day (int day) {
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public void getDayName(){
        String day = null;
        switch (this.day) {
            case 1:
                day = "MONDAY";
                break;
            case 2:
                day = "TUESDAY";
                break;
        }
        System.out.println(day);
    }

}
