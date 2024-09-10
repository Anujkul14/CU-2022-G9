package lec29;

class Box {
    private double width;
    private double height;
    private double depth;

    private static int boxCount = 0;

    public Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
        boxCount++;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        boxCount++;
    }

    public Box(Box otherBox) {
        this.width = otherBox.width;
        this.height = otherBox.height;
        this.depth = otherBox.depth;
        boxCount++;
    }

    public double volume() {
        return width * height * depth;
    }

    public static int getBoxCount() {
        return boxCount;
    }

    public void displayDimensions() {
        System.out.println("Width: " + this.width + ", Height: " + this.height + ", Depth: " + this.depth);
    }

    public static void showBoxInfo(Box box) {
        box.displayDimensions();
    }
}

class ColoredBox extends Box {

    private String color;

    public ColoredBox() {
        super();
        this.color = "White";
    }

    public ColoredBox(double width, double height, double depth, String color) {
        super(width, height, depth);
        this.color = color;
    }

    @Override
    public void displayDimensions() {
        super.displayDimensions();
        System.out.println("Color: " + this.color);
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void changeColor(int colorCode) {
        this.color = "ColorCode-" + colorCode;     }
}

final class SealedBox extends ColoredBox {

    private boolean isSealed;

    public SealedBox(double width, double height, double depth, String color, boolean isSealed) {
        super(width, height, depth, color);
        this.isSealed = isSealed;
    }

        @Override
    public void displayDimensions() {
        super.displayDimensions();
        System.out.println("Is Sealed: " + this.isSealed);
    }


}

public class BookCD {
    public static void main(String[] args) {
        Box box1 = new Box(3, 4, 5);
        box1.displayDimensions();
        System.out.println("Volume of box1: " + box1.volume());

        ColoredBox coloredBox = new ColoredBox(6, 7, 8, "Red");
        coloredBox.displayDimensions();
        coloredBox.changeColor("Blue");
        coloredBox.displayDimensions();

        SealedBox sealedBox = new SealedBox(10, 12, 15, "Green", true);
        sealedBox.displayDimensions();

        SealedBox.showBoxInfo(box1);
        SealedBox.showBoxInfo(coloredBox);
        SealedBox.showBoxInfo(sealedBox);

        System.out.println("Total number of Box objects created: " + Box.getBoxCount());

    }
}








