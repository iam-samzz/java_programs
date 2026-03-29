class MovieTicket
{
    private String customerName;
    private int numTicket;
    
    MovieTicket(String cus_name, int numTick)
    {
        this.customerName = cus_name;
        this.numTicket = numTick;
    }

    void showBooking()
    {
        System.out.println(this.customerName+":"+this.numTicket);
    }
}

class main2
{
    public static void main(String[] args)
    {
        MovieTicket p1 = new MovieTicket("Samaran",2);
        MovieTicket p2 = new MovieTicket("Ramesh",4);

        p1.showBooking();
        p2.showBooking();
    }
}