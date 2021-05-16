package za.ac.cput.adpAssignmentTwo;

import java.util.HashMap;
import java.util.*;
public class MapExample {

    HashMap<String, Integer> spellCost = new HashMap<String, Integer>();

    public void adding() {
        spellCost.put("fireball",50);
        spellCost.put("earthwall",40);
        spellCost.put("waterball",25);
        spellCost.put("windslash",30);
    }

    public void removing(){
        spellCost.remove("windslash");
    }

    public void finding(){
        if (spellCost.containsKey("earthwall"))
            System.out.println("found");
        else
            System.out.println("missing");

    }
}
