package lec21;

public class ThisKeyword {
    int val;
    String str;

    public ThisKeyword getClassObj() {
        return this;
    }

    public void printDetails(ThisKeyword obj) {
        System.out.println("Val :" + obj.val + " Name :" + obj.str);     }

        public void print() {
        this.printDetails(this);     }

        public static void main(String args[]) {
        ThisKeyword obj = new ThisKeyword();
        obj.getClassObj();
    }
}
