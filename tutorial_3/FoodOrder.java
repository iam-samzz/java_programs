class FoodOrder
{
    private String itemName;
    private int Quantity;

    FoodOrder()
    {
        this.itemName = "Burger";
        this.Quantity = 1;
    }

    FoodOrder(String itemName)
    {
        this.itemName = itemName;
        this.Quantity = 1;
    }

    FoodOrder(String itemName, int Quantity)
    {
        this.itemName = itemName;
        this.Quantity = Quantity;
    }

    public void showOrder()
    {
        System.out.println("Order Detail:");
        System.out.println(this.itemName + ":" + this.Quantity);
    }
}


class main3
{
    public static void main(String[] args)
    {
        FoodOrder order1 = new FoodOrder();
        FoodOrder order2 = new FoodOrder("Briyani");
        FoodOrder order3 = new FoodOrder("Pizza",10);


        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}