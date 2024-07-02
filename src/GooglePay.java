public class GooglePay {
    private UPI upi;

    public GooglePay(UPI upi) {
        this.upi = upi;
    }

    public boolean pay(UPI toUpi, int amt) {
        if(this.upi.getBal() < amt) {
            return false;
        }
        this.upi.upiWithdraw(amt);
        toUpi.upiDeposit(amt);
        return true;
    }
}
