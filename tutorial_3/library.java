class library
{
    
    private int fine_amount;

    library()
    {
        this.fine_amount = 5;
    }

    void display_fine()
    {
        System.out.println(fine_amount);
    }
}

class main
{
    public static void main(String[] args)
    {
        library p1 = new library();
        p1.display_fine();
    }
}