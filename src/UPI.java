public interface UPI {
    boolean upiDeposit(int amt);
    int upiWithdraw(int amt);

    int getBal();
}
