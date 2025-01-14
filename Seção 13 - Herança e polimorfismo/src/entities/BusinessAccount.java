package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //Chama o constructor da classe pai, dentro da classe filha
        this.loanLimit = loanLimit;
    }

    @Override
    public void withDraw(Double amount) {
        super.withDraw(amount);
        balance -= 2.0;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            //deposit(amount);
            balance += amount - 10.0;
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
