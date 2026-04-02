class BankAccount
{
    private String accountNumber;
    public String accountHolder;
    private double balance;

    BankAccount(String accNum, String holder)
    {
        this.accountHolder = holder;
        this.accountNumber = accNum;
        this.balance = 0.0;
    }
    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }


    public void withdraw(double amount)
    {
        if(this.balance >=amount)
        {
            this.balance = this.balance - amount;
        }
        else
        {
            System.out.println("No sufficient Funds!");
        }
    }

    public void displayAccountInfo()
    {
        System.out.println("Name:"+this.accountHolder);
        System.out.println("Balance:"+this.balance);
        System.out.println("Acc Num:"+ this.accountNumber);
    }
}

class program2
{
    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount("1234","Samaran");
        
        b1.deposit(1000.00);
        b1.withdraw(200.00);
        b1.displayAccountInfo();
    }
}
