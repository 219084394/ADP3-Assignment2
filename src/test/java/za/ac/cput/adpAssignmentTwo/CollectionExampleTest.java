package za.ac.cput.adpAssignmentTwo;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class CollectionExampleTest {
    CollectionExample collection1 = new CollectionExample();

    @Test
    public void adding() {
        collection1.adding();
        Collection<String> actual = Arrays.asList("health","mana","stamina","strength");
        Collection<String> expected = collection1.potion;
        assertEquals(expected,actual);
        System.out.println("Actual: "+actual);
        System.out.println("Expected: "+expected);
    }

    @Test
    public void removing() {
        collection1.adding();
        collection1.removing();
        Collection<String> actual = Arrays.asList("health","mana","stamina");
        Collection<String> expected = collection1.potion;
        assertNotSame(expected,actual);
        System.out.println("Actual: "+actual);
        System.out.println("Expected: "+expected);
    }

    @Test
    public void finding() {
        collection1.adding();
        assertTrue(collection1.potion.contains("strength"));
    }
}