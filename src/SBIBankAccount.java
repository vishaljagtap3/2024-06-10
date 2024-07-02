public class SBIBankAccount implements UPI{
    private int accNo;
    private String accName;
    private int bal;
    private int inc;

    public SBIBankAccount(int accNo, String accName, int bal, int inc) {
        this.accNo = accNo;
        this.accName = accName;
        this.bal = bal;
        this.inc = inc;
    }
    public void display() {
        System.out.println(accNo + " " + accName + " " + bal + " " + inc);
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

    public int getInc() {
        return inc;
    }

    public void setInc(int inc) {
        this.inc = inc;
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
