import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("blue tortilla");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("red tortilla");
        kitchenWithMany.add("blue tortilla");
        kitchenWithMany.add("purple tortilla");

    }

    @Test
    public void testIfTortillasExist(){
        assertEquals(0, emptyKitchen.size());
        assertTrue(kitchenWithOne.contains("blue tortilla"));
        assertEquals(1, kitchenWithOne.size());
        assertTrue(kitchenWithMany.contains("blue tortilla"));
        assertEquals(2, kitchenWithMany.size());
    }


    /// Integration test ( 1 / 2 )
    @Test
    public void testIfATortillaCanBeAdded(){
        assertFalse(emptyKitchen.contains("red tortilla"));
        assertTrue(kitchenWithOne.contains("blue tortilla"));
        assertTrue(kitchenWithMany.contains("blue torilla"));
    }

    @Test
    public void testIfTortillaCanBePopped(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());
        kitchenWithMany.pop();
        assertEquals(2, kitchenWithMany.size());
    }

}