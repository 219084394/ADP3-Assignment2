package za.ac.cput.adpAssignmentTwo;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    Set<String> spell = new HashSet<>();
    public void adding() {
        spell.add("fireball");
        spell.add("earthwall");
        spell.add("waterball");
        spell.add("windslash");
    }

    public void removing(){
        spell.remove("windslash");
    }

    public void finding(){
        if (spell.contains("fireball"))
            System.out.println("found");
        else
            System.out.println("missing");

    }
}