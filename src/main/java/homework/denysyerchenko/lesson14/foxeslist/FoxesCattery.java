package homework.denysyerchenko.lesson14.foxeslist;
import java.util.HashSet;
import java.util.TreeSet;

public class FoxesCattery {
    public static void main(String[] args) {
        HashSet<Fox> foxes = new HashSet();
        foxes.add(new Fox("Kitsune", 5));
        foxes.add(new Fox("Juniper", 6));
        foxes.add(new Fox("Fig", 4));
        foxes.add(new Fox("Locus", 8));
        System.out.println("Foxes list before sorting: " + foxes);
        TreeSet<Fox> foxTreeSet = new TreeSet<>(new FoxesComparator());
        foxTreeSet.addAll(foxes);
        System.out.println("Foxes list after using comparator: " + foxTreeSet);
        TreeSet<Fox> foxTreeSet2 = new TreeSet<>();
        foxTreeSet2.addAll(foxTreeSet);
        System.out.println("Foxes list after using comparable: " + foxTreeSet2);
    }
}