package lec28;

class Toll{

    private String location;
    private int collectedAmount;
    private int vehicleCount;

    private static int totalCollection = 0;

//// Default constructor
//public TollBooth() {
//   this.location = "Unknown";
//   this.collectedAmount = 0;
//   this.vehicleCount = 0;
//}

    public Toll(String location) {
        this.location = location;
        this.collectedAmount = 0;
        this.vehicleCount = 0;
    }

    public Toll(String location, int collectedAmount, int vehicleCount) {
        this.location = location;
        this.collectedAmount = collectedAmount;
        this.vehicleCount = vehicleCount;
        totalCollection += collectedAmount;
    }

    public void collectToll(int amount) {
        this.collectedAmount += amount;
        this.vehicleCount++;
        totalCollection += amount;
    }

    public void collectToll(int amount, String vehicleType) {
        this.collectToll(amount); //
        System.out.println("Collected toll from " + vehicleType + ": " + amount);
    }

    public static int getTotalCollection() {
        return totalCollection;
    }

    public void displayInfo() {
        System.out.println("Location: " + this.location);
        System.out.println("Total Amount Collected: " + this.collectedAmount);
        System.out.println("Number of Vehicles Passed: " + this.vehicleCount);
    }

}

public class TollBooth {
    public static void main(String[] args) {
        Toll booth1 = new Toll("Highway 1");
        Toll booth2 = new Toll("Highway 2", 500, 10);

        booth1.collectToll(100);
        booth1.collectToll(200, "Truck");

        booth2.collectToll(150);
        booth2.collectToll(250, "Bus");

        booth1.displayInfo();
        booth2.displayInfo();

        System.out.println("Total Collection Across All Toll Booths: " + Toll.getTotalCollection());

    }
}
