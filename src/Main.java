public class Main {
    public static void main(String[] args) {

        /*HDFCBankAccount hba1 = new HDFCBankAccount(
                101, "X1", 1000
        );
        hba1.display();

        SBIBankAccount sba1 = new SBIBankAccount(
                1201,
                "Y1",
                2300,
                100
        );
        sba1.display();

        UPI upi;

        upi = hba1;
        upi.upiDeposit(100);

        upi = sba1;
        upi.upiWithdraw(100);

        hba1.display();
        sba1.display();*/

        HDFCBankAccount hba1 = new HDFCBankAccount(
                101, "X1", 1000
        );
        hba1.display();

        SBIBankAccount sba1 = new SBIBankAccount(
                1201,
                "Y1",
                2300,
                100
        );
        sba1.display();

        GooglePay g1 = new GooglePay(hba1);

        boolean transactionStatus = g1.pay(sba1, 200);
        System.out.println(transactionStatus);

        hba1.display();
        sba1.display();

    }
}
