public class Item
{
    public final static byte MAIN = 1;
    public final static byte DRINK = 2;
    public final static byte ALCOHOL = 3;
    public final static byte DESSERT = 4;

    private int     ID;
    private String  name;
    private byte    type;
    private double  price;

    private byte     state;
    private double  promotion_price;
    public final static byte PROMOTION_ITEM = 1;

    public Item(int newID, String newName, double newPrice, byte newType)
    {
        this.ID = newID;
        this.name = newName;
        this.price = newPrice;
        this.type = newType;
        this.state = 0;
        this.promotion_price = 0;
    }

    public void setName( String newName)
    {
        this.name = newName;
    }

    public void setPrice( double newPrice)
    {
        this.price = newPrice;
    }

    public void setType(byte newType)
    {
        this.type = newType;
    }

    public void setState(byte newState, double tempPrice)
    {
        this.state = newState;
        this.promotion_price = tempPrice;
    }

    public void resetState()
    {
        this.state = 0;
        this.promotion_price = 0;
    }

    int getID()
    {
        return this.ID;
    }

    String getName()
    {
        return this.name;
    }

    double getPrice()
    {
        if(this.state != 0 && this.promotion_price != 0)
        {
            return this.promotion_price;
        }
        else
            return this.price;
    }

    double gerRegularPrice()
    {
        return this.price;
    }

    byte getType()
    {
        return this.type;
    }

    byte getState()
    {
        return this.state;
    }
}
