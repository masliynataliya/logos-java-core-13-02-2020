package homework.markoTolochko.lesson13Rada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;

public class Faction {
    ArrayList<String> deputyArrayList = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
public void addDeputy(){
    System.out.println("add deputy ");
    deputyArrayList.add(scan.next());
}
public void removeDeputy(){
    System.out.println("remove deputy ");
    deputyArrayList.remove(scan.next());
}
public void showAllGrafters(){
//komparator
}
public void showAllDeputy(){
    System.out.println(deputyArrayList);
}
public void removeAllDeputy(){
    deputyArrayList.removeAll(deputyArrayList);
}

}
