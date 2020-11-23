package homework.ihorpayensky.homeworks.homework23.min;

import java.util.ArrayList;
import java.util.List;

class Fraction {

    private int id;
    private static int maxId = 0;
    private String fractionName;
    private List<Deputy> deputyList;

    public Fraction(String fractionName) {
        this.id = maxId;
        maxId++;
        this.fractionName = fractionName;
        this.deputyList = new ArrayList<>();
    }

    public void addDeputy(Deputy deputy) {
        deputyList.add(deputy);
    }

    public int getId() {
        return id;
    }

    public void clearDeputyList() {
        deputyList.clear();
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }

    public List<Deputy> getDeputyList() {
        return deputyList;
    }

    public void setDeputyList(List<Deputy> deputyList) {
        this.deputyList = deputyList;
    }

    @Override
    public String toString() {
        return this.fractionName + "\n\t\t" +
                deputyList.toString();
    }
}
