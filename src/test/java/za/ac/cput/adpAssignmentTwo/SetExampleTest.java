package za.ac.cput.adpAssignmentTwo;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetExampleTest {
    SetExample set1 = new SetExample();
    Set<String> spellName;

    @Test
    public void adding() {
    set1.adding();

    spellName = new HashSet<>();
    spellName.add("fireball");
    spellName.add("earthwall");
    spellName.add("waterball");
    spellName.add("windslash");
    assertEquals(4, spellName.size());
    assertEquals(set1.spell, spellName);
        System.out.println("Actual: "+set1.spell);
        System.out.println("Expected: "+spellName);

    }

    @Test
    public void removing() {
        set1.adding();
        set1.removing();
        spellName = new HashSet<>();
        spellName.add("fireball");
        spellName.add("earthwall");
        spellName.add("waterball");
        spellName.add("windslash");
        spellName.remove("windslash");
        assertFalse(spellName.contains("windslash"));
        assertEquals(set1.spell,spellName);
        System.out.println("Actual: "+set1.spell);
        System.out.println("Expected: "+spellName);
    }

    @Test
    public void finding() {
        set1.adding();
        assertTrue(set1.spell.contains("fireball"));
    }
}