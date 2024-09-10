package lec26;

public class BankFee {
    private String charge_description;
    private float charge;

    public BankFee(String charge_description,float charge)
    {
        this.charge_description = charge_description;
        this.charge = charge;
    }
    public void print()
    {
        System.out.println("Description :" + charge_description + " Charge :"+ charge);
    }

    public String getCharge_description() {
        return charge_description;
    }

    public void setCharge_description(String charge_description) {
        this.charge_description = charge_description;
    }
    public float getCharge() {
        return charge;
    }
    public void setCharge(float charge) {
        this.charge = charge;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BankFee cust1 = new BankFee("Minimum Balance", 200);
        //BankFee cust2 = new BankFee();
        BankFee cust3;
    }
}
