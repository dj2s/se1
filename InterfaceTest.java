import static org.junit.jupiter.api.Assertions.*;

class InterfaceTest {


    @org.junit.jupiter.api.Test
    public void run()
    {
        Sort test = new Test();
        assertEquals( true, test.isWellSorted(new String[]{"A", "B", "C", "D", "E"}));
        assertEquals( true, test.isWellSorted(new String[]{"A", "A", "B", "B", "C", "D", "E"}));
        assertEquals( false, test.isWellSorted(new String[]{"B", "A", "B", "B", "C", "D", "E"}));
        assertEquals( true, test.isWellSorted(new String[]{"A", "D", "B", "B", "C", "D", "E"}));
        assertEquals( true, test.isWellSorted(new String[]{"A", "D", "B", "C", "E"}));
        assertEquals( false, test.isWellSorted(new String[]{"A", "B", "C", "E"}));
        assertEquals( true, test.isWellSorted(new String[]{"A"}));
        assertEquals( false, test.isWellSorted(new String[]{"E"}));
        assertEquals( true, test.isWellSorted(new String[]{"Z"}));
        assertEquals( true, test.isWellSorted(null));
    }

}
