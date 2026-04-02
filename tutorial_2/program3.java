class Bank
{
    public void loan(int principle,int intrest_rate)
    {
        System.out.println("This is personal loan");
    }

    public void loan(int principle,int intrest_rate,int loan_tenure)
    {
        System.out.println("This is Home loan");
    }

    public void loan(int principle,int intrest_rate,int loan_tenure,int additional_processing_fee)
    {
        System.out.println("This is CAR loan");
    }
}   

class program3
{
    public static void main(String[] args)
    {
        Bank b = new Bank();

        b.loan(1000,10);
        b.loan(100000,10,30);
        b.loan(100000,10,30,20000);
    }
}