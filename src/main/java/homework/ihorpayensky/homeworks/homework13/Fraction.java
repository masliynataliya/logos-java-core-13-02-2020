package homework.ihorpayensky.homeworks.homework13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Fraction implements Comparable<Fraction> {

    private List<Deputy> deputyList;
    private String name;

    public Fraction() {
        this.deputyList = new ArrayList<>();
        this.name = "noname";
    }

    public Fraction(String name) {
        this.deputyList = new ArrayList<>();
        this.name = name;
    }

    public void addDeputy(Deputy deputy) {
        this.deputyList.add(deputy);
    }

    public void deleteDeputy(String name, String lastName) {
        Iterator<Deputy> deputyIterator = deputyList.iterator();

        while(deputyIterator.hasNext()) {

            Deputy d = deputyIterator.next();
            if (d.getFirstName().equalsIgnoreCase(name) &&
            d.getLastName().equalsIgnoreCase(lastName)) {
                deputyIterator.remove();
                deputyList.remove(d);
                System.out.println("Депутата було вигнано!");
            }
        }
    }

    public List<Deputy> findAllBribers() {
        List<Deputy> bribers = new ArrayList<>();
        for (Deputy d: this.deputyList) {
            if (d.isBriber()) {
                bribers.add(d);
            }
        }
        return bribers;
    }

    public Deputy findBestBriber() {
        Deputy deputy = this.deputyList.get(0);
        for (Deputy d: this.deputyList) {
            if (deputy.getBribeSize() < d.getBribeSize()) {
                deputy = d;
            }
        }
        if (deputy.getBribeSize() == 0) { return null; }
        return deputy;
    }

    public List<Deputy> getDeputyList() {
        return this.deputyList;
    }

    public void clearFraction() {
        this.deputyList.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Fraction o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Фракція '" + name + "'";
    }

    public void getAllInfo() {
        System.out.println("Назва '" + this.name + "'");
        System.out.println("Кількість депутатів: " + this.deputyList.size());
        deputyList.sort(Deputy::compareTo);
        for (Deputy e: deputyList) {
            System.out.println(e.toString());
        }
    }
}
