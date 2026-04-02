class Book
{

    private int bookID;
    private String title;
    private boolean availabilityStatus;

    Book(int bookID,String title,boolean status)
    {
        this.bookID = bookID;
        this.title = title;
        this.availabilityStatus = status;
    }

    public void DisplayDetails()
    {
        System.out.println(this.bookID+":"+this.title);
    }

    public void check()
    {
        if(this.availabilityStatus == true)
        {
            System.out.println("Booke Available");
        }
        else
        {
            System.out.println("Not available");
        }
    }
}

class program1
{
    public static void main(String[] args)
    {
        Book b1 = new Book(001,"Harry Potter",false);

        b1.DisplayDetails();
        b1.check();

    }
}