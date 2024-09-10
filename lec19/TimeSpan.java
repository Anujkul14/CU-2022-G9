package lec19;

public class TimeSpan {

    private int days;
    private int hours;
    private int minutes;
    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void convertSeconds() {
        days = seconds / (24 * 60 * 60);
        seconds %= (24 * 60 * 60);

        hours = seconds / (60 * 60);
        seconds %= (60 * 60);

        minutes = seconds / 60;
        seconds %= 60;
    }

    public void print() {
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
