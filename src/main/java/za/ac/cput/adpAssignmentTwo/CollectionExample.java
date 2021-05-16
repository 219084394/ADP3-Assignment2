package za.ac.cput.adpAssignmentTwo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    Collection<String> potion = new ArrayList<String>();
    public void adding(){
        potion.add("health");
        potion.add("mana");
        potion.add("stamina");
        potion.add("strength");
    }

    public void removing(){
        potion.remove("strength");
    }

    public void finding(){
        if (potion.contains("mana"))
            System.out.println("found");
        else
            System.out.println("missing");

    }
}
