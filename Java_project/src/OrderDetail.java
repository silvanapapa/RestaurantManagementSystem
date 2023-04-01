public class OrderDetail
{
    private int itemID;
    private String itemName;
    private double price;
    private byte quantity;
    private double totalPrice;

    public OrderDetail(Item newMenuItem, byte newQuantity)
    {
        this.itemID     = newMenuItem.getID();
        this.itemName   = newMenuItem.getName();
        this.price      = newMenuItem.getPrice();
        this.quantity   = newQuantity;
        this.totalPrice = this.price * this.quantity;
    }
    public int getItemID()
    {
        return this.itemID;
    }
    public String getItemName()
    {
        return this.itemName;
    }
    public double getPrice()
    {
        return this.price;
    }
    public byte getQuantity()
    {
        return this.quantity;
    }
    public double getTotalPrice()
    {
        return this.totalPrice;
    }

    public void addQuantity(byte add)
    {
        quantity += add;
        totalPrice = price * quantity;
    }

}
