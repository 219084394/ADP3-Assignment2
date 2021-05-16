package za.ac.cput.adpAssignmentTwo;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapExampleTest {
    MapExample map1 = new MapExample();
    Map<String,Integer> map;

    @Test
    public void adding() {
        map1.adding();
        map = new HashMap<>();
        map.put("fireball",50);
        map.put("earthwall",40);
        map.put("waterball",25);
        map.put("windslash",30);
        assertEquals(4,map.size());
        assertEquals(map1.spellCost,map);
        System.out.println("Actual: "+map1.spellCost);
        System.out.println("Expected: "+map);
    }

    @Test
    public void removing() {
        map1.adding();
        map1.removing();
        map = new HashMap<>();
        map.put("fireball",50);
        map.put("earthwall",40);
        map.put("waterball",25);
        map.put("windslash",30);
        map.remove("windslash");
        assertFalse(map.containsKey("windslash"));
        assertEquals(map1.spellCost,map);
        System.out.println("Actual: "+map1.spellCost);
        System.out.println("Expected: "+map);
    }

    @Test
    public void finding() {
        map1.adding();
        assertTrue(map1.spellCost.containsKey("earthwall"));
    }
}