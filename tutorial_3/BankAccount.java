class BankAccount
{
    private String accountHolder;
    private long balance;
    protected String accountType;
    long accountNumber;


    //constructor
    BankAccount(long accountNumber, String accountType, long balance, String accountHolder)
    {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    

    public void viewBalance()
    {
        System.out.println("Balance:"+ this.balance);
    }

    protected void updateAccountType_s(String accountType)
    {
        System.out.print("Account Type Updated from "+this.accountType+" to ");

        this.accountType = accountType;

        System.out.println(this.accountType);   
    }

    private void updateBalance(long amount)
    {
        System.out.print("Balance changed from "+this.balance+" to ");

        this.balance = amount;

        System.out.println(this.balance);
    }

    public void deposit(long amount)
    {
        this.balance = this.balance + amount;

        System.out.println("Deposited!");
        System.out.println("Current Balance:"+this.balance);

    }

    //for otherss
    protected void modifyBalanceByAdmin(int amount)
    {
        
        this.updateBalance(amount);

    }   


}


class Employee extends BankAccount
{
    Employee(long accountNumber, String accountType, long balance, String accountHolder) {
        super(accountNumber, accountType, balance, accountHolder);
    }

    public void updateAccountType(BankAccount customer,String accountType)
    {
        customer.updateAccountType_s(accountType);
    }

    public void modifyBalanceByAdmin(int amount)
    {
        System.out.println("Employee Cannot access balance modify");
    }

}

class Admin extends BankAccount
{
    Admin(long accountNumber, String accountType, long balance, String accountHolder) {
        super(accountNumber, accountType, balance, accountHolder);
    }

    public void updateAccountType(BankAccount customer,String accountType)
    {
        customer.updateAccountType_s(accountType);
    }

    public void modifyBalance(BankAccount customer,int amount)
    {
        
        customer.modifyBalanceByAdmin(amount);
    }

    
}


class main4
{
    public static void main(String[] args)
    {
        BankAccount c1 = new BankAccount(123,"Savings",2000,"Samaran.S");
        c1.viewBalance();
        c1.deposit(200);

        Employee e1 = new Employee(-1,"",-1,"");
        e1.updateAccountType(c1,"Current");
        e1.modifyBalanceByAdmin(1000000);


        Admin a1 = new Admin(-1,"",-1,"");
        a1.modifyBalance(c1,500); //changing for other

        c1.viewBalance();
    }
}