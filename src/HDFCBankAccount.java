public class HDFCBankAccount implements UPI {
    private int accNo;
    private String accName;
    private int bal;

    public HDFCBankAccount(int accNo, String accName, int bal) {
        this.accNo = accNo;
        this.accName = accName;
        this.bal = bal;
    }

    public void display() {
        System.out.println(accNo + " " + accName + " " + bal);
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    @Override
    public boolean upiDeposit(int amt) {
        if(amt <= 0) {
            return false;
        }
        bal += amt;
        return true;
    }

    @Override
    public int upiWithdraw(int amt) {
        if(amt <= 0 || amt > bal) {
            return 0;
        }
        bal -= amt;
        return amt;
    }
}
