package homework.markoTolochko.lesson12OwnArrayList;

import java.util.ArrayList;


public class OwnArrayList {
    ArrayList <Integer> arrayList = new ArrayList<>();
    @Override
    public String toString() {
        return "arrayList= " + arrayList;
    }
    public void addToArr(int number){
        arrayList.add(number);
    }
    public void removeFromArr(int number){
        arrayList.remove(number);
    }


}
