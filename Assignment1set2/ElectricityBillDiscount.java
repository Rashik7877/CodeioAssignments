public class ElectricityBillDiscount {
    public static void main(String[] args) {
        int BillAmount = 1205;
        if (BillAmount > 1000){
            BillAmount = BillAmount - (10/100);
            System.out.println("bill amount ="+BillAmount);
        }
        else if (BillAmount > 500 && BillAmount<1000) {
            BillAmount = BillAmount - (5/100);
            System.out.println("bill amount = "+BillAmount);
        }
        else {
            System.out.println("Pay full bill");
        }
    }
}