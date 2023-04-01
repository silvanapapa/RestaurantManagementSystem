import org.junit.Test;

public class OrderDetailTest
{
    @Test
    public void testGetters()
    {
        Item item = new Item(1, "Quattro Formaggi Pasta", 10.50, Item.MAIN);
        OrderDetail orderDetail = new OrderDetail(item, (byte) 2);
        assert orderDetail.getItemID() == 1;
        assert orderDetail.getItemName().equals("Quattro Formaggi Pasta");
        assert orderDetail.getPrice() == 10.50;
        assert orderDetail.getQuantity() == 2;
        assert orderDetail.getTotalPrice() == 21;
    }

    @Test
    public void testAddQuantity()
    {
        Item item = new Item(1, "Salami Pizza", 10.50, Item.MAIN);
        OrderDetail orderDetail = new OrderDetail(item, (byte) 2);
        orderDetail.addQuantity((byte)1);
        assert orderDetail.getQuantity() == 3;
        assert orderDetail.getTotalPrice() == 31.5;
    }
}
