package za.ac.cput.adpAssignmentTwo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class ListExampleTest {
    ListExample list1 = new ListExample();
    @Test
    public void adding() {
        List<String> actual = Arrays.asList("staff","mace","axe","sword");
        list1.adding();
        List<String> expected = list1.weapon;
        assertEquals(expected,actual);
        System.out.println("Actual: "+actual);
        System.out.println("Expected: "+expected);
    }

    @Test
    public void removing() {
        list1.adding();
        list1.removing();
        List<String> actual = Arrays.asList("staff","mace","axe");
        List<String> expected = list1.weapon;
        assertEquals(expected,actual);
        System.out.println("Actual: "+actual);
        System.out.println("Expected: "+expected);
    }

    @Test
    public void finding() {
        list1.adding();
        assertTrue(list1.weapon.contains("axe"));
    }
}