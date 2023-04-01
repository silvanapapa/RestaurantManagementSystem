import org.junit.Test;

public class OrderTest
{
    @Test
    public void testAddItem()
    {
        Order order = new Order(1, "Marian Ionescu");
        Item item = new Item(1, "Burger", 10.50, Item.MAIN);
        order.addItem(item, (byte) 2);
        assert order.getOrderDetail().size() == 1;
        assert order.getTotal() == 21;
    }

    @Test
    public void testDeleteItem()
    {
        Order order = new Order(1, "Marian Ionescu");
        Item item1 = new Item(1, "Fried chicken", 10.50, Item.MAIN);
        Item item2 = new Item(2, "Mashed potatoes", 5.50, Item.MAIN);
        order.addItem(item1, (byte) 2);
        order.addItem(item2, (byte) 3);
        assert order.deleteItem(1) == true;
        assert order.getOrderDetail().size() == 1;
        assert order.getTotal() == 21;
    }

    @Test
    public void testGetState()
    {
        Order order = new Order(1, "Marian Ionescu");
        order.setState(Order.ORDER_CLOSED);
        assert order.getState() == Order.ORDER_CLOSED;
    }

}