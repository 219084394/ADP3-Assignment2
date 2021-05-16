package za.ac.cput.adpAssignmentTwo;
/*author Liam Stewart
 *219084394
 * ADP 3 ASSIGNMENT 2
 * A very simple program that has hard coded values to use for collection interface tests
 */
public class Main {
    public static void main(String[] args) {
        CollectionExample potion = new CollectionExample();
        potion.adding();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("COLLECTION EXAMPLE");
        System.out.println(" ");
        System.out.println("Array after .add function");
        System.out.println(potion.potion);
        potion.removing();
        System.out.println("Array after .removed function");
        System.out.println(potion.potion);
        System.out.println("Find example where I search the array for an already added value");
        potion.finding();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("MAP EXAMPLE");
        System.out.println(" ");
        MapExample spellCost = new MapExample();
        spellCost.adding();
        System.out.println("Array after .add function");
        System.out.println(spellCost.spellCost);
        spellCost.removing();
        System.out.println("Array after .removed function");
        System.out.println(spellCost.spellCost);
        System.out.println("Find example where I search the array for an already added value");
        spellCost.finding();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("SET EXAMPLE");
        System.out.println(" ");
        SetExample spell = new SetExample();
        spell.adding();
        System.out.println("Array after .add function");
        System.out.println(spell.spell);
        spell.removing();
        System.out.println("Array after .removed function");
        System.out.println(spell.spell);
        System.out.println("Find example where I search the array for an already added value");
        spell.finding();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("LIST EXAMPLE");
        System.out.println(" ");
        ListExample weapon = new ListExample();
        weapon.adding();
        System.out.println("Array after .add function");
        System.out.println(weapon.weapon);
        weapon.removing();
        System.out.println("Array after .removed function");
        System.out.println(weapon.weapon);
        System.out.println("Find example where I search the array for an already added value");
        weapon.finding();
    }
}
