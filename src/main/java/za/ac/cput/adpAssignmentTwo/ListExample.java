package za.ac.cput.adpAssignmentTwo;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    List<String> weapon = new ArrayList<String>();
    public void adding() {
        weapon.add("staff");
        weapon.add("mace");
        weapon.add("axe");
        weapon.add("sword");
    }

    public void removing(){
        weapon.remove("sword");
    }

    public void finding(){
        if (weapon.contains("axe"))
            System.out.println("found");
        else
            System.out.println("missing");

    }
}