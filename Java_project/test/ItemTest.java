import org.junit.Test;

public class ItemTest
{
    @Test
    public void testGetters() {
        Item item = new Item(1, "Fried chicken", 5.34, Item.MAIN);
        assert item.getID() == 1;
        assert item.getName().equals("Fried chicken");
        assert item.getPrice() == 5.34;
        assert item.getType() == Item.MAIN;
        assert item.getState() == 0;
    }

    @Test
    public void testSetters() {
        Item item = new Item(1, "Mashed potatoes", 10.99, Item.MAIN);
        item.setName("Mashed potatoes");
        item.setPrice(3.4);
        item.setType(Item.MAIN);
        assert item.getName().equals("Mashed potatoes");
        assert item.getPrice() == 3.4;
        assert item.getType() == Item.MAIN;
    }

    @Test
    public void testPromotion() {
        Item item = new Item(1, "Burger", 10.99, Item.MAIN);
        item.setState(Item.PROMOTION_ITEM, 8.99);
        assert item.getPrice() == 8.99;
        assert item.getState() == Item.PROMOTION_ITEM;
        item.resetState();
        assert item.getPrice() == 10.99;
        assert item.getState() == 0;
    }
}
