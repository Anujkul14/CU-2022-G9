package lec19;

public class TimeSpan_Client {
    public static void main(String[] args) {
        TimeSpan obj = new TimeSpan();

        obj.setSeconds(81500);

        obj.convertSeconds();

        obj.print();
    }
}
