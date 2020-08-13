package homework.ihorpayensky.homeworks.homework13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class RADA {
    private List<Fraction> fractions = new ArrayList<>();

    public List<Fraction> getFractions() {
        return fractions;
    }

    public void addFraction(String fraction) {
        boolean temp = true;
        Iterator<Fraction> fractionIterator = fractions.iterator();
        while (fractionIterator.hasNext()) {
            if (fractionIterator.next().getName().equalsIgnoreCase(fraction)) {
                System.out.println("Така фракція вже існує");
                temp = false;
                break;
            }
        }
        if (temp) {
            this.fractions.add(new Fraction(fraction));
            System.out.println("Додано нову фракцію '" + fraction + "'");
        }
    }

    public void removeFraction(String fraction) {
        boolean temp = true;
        Iterator<Fraction> fractionIterator = fractions.iterator();
        while(fractionIterator.hasNext()) {
            Fraction f = fractionIterator.next();
            if (f.getName().equalsIgnoreCase(fraction)) {
                System.out.println("Фракцію '" + f.getName() + "' видалено!");
                fractionIterator.remove();
                fractions.remove(f);
                temp = false;
            }
        }
        if (temp) {
            System.out.println("Таку фракцію не знайдено!");
        }
    }

    public void getAllFractions() {
        if (this.fractions.isEmpty())
            System.out.println("На даний час список фракцій пустий!");
        else {
            fractions.sort(Fraction::compareTo);
            Iterator<Fraction> fractionIterator = this.fractions.iterator();
            while (fractionIterator.hasNext()) {
                System.out.println(fractionIterator.next().toString());
            }
        }
    }

    public void clearFraction(String fraction) {
        if (this.fractions.isEmpty())
            System.out.println("Не має що очищувати, список фракцій пустий!");
        else {
            boolean temp = true;
            Iterator<Fraction> fractionIterator = this.fractions.iterator();
            while (fractionIterator.hasNext()) {
                if (fractionIterator.next().getName().equalsIgnoreCase(fraction)) {
                    System.out.println("Фракцію '" + fractionIterator.next().getName() + "' очищено!");
                    fractionIterator.remove();
                    fractionIterator.next().clearFraction();
                    temp = false;
                    break;
                }
            }
            if (temp) {
                System.out.println("Таку фракцію не знайдено!");
            }
        }
    }

    public void getFractionInfo(String fraction) {
        if (this.fractions.isEmpty()) {
            System.out.println("Список фракцій пустий!");
        } else {
            boolean temp = true;
            for (Fraction e: fractions) {
                if (e.getName().equalsIgnoreCase(fraction)) {
                    e.getAllInfo();
                    temp = false;
                    break;
                }
            }
            if (temp) {
                System.out.println("Такої фракції не знайдено!");
            }
        }
    }

    public boolean checkFraction(String fraction) {
        for (Fraction e: fractions) {
            if (e.getName().equalsIgnoreCase(fraction)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDeputyIdentity(String name, String lastName) {
        for (Fraction fraction: fractions) {
            for (Deputy deputy: fraction.getDeputyList()) {
                if (deputy.getFirstName().equalsIgnoreCase(name) && deputy.getLastName().equalsIgnoreCase(lastName)) {
                    System.out.println("Такий депутат уже зареєстрований у фракції '" + fraction.getName() + "'");
                    return true;
                }
            }
        }
        return false;
    }

    public void addDeputyToFraction(String fraction, Deputy deputy) {
        for (Fraction e: fractions) {
            if (e.getName().equalsIgnoreCase(fraction)) {
                e.addDeputy(deputy);
            }
        }
    }

    public void removeDeputyFromFraction(String fraction, String name, String lastName) {
        for (Fraction e: fractions) {
            if (e.getName().equalsIgnoreCase(fraction)) {
                for (Deputy d: e.getDeputyList()) {
                    if (d.getFirstName().equalsIgnoreCase(name) &&
                    d.getLastName().equalsIgnoreCase(lastName)) {
                        e.deleteDeputy(name, lastName);
                        break;
                    }
                }
            }
        }
    }


    public void findAllBribers() {
        fractions.sort(Fraction::compareTo);
        for (Fraction f: fractions) {
            System.out.println("Фракція '" + f.getName() + "'");
            f.getDeputyList().sort(Deputy::compareTo);
            for (Deputy d: f.getDeputyList()) {
                if (d.isBriber())
                    System.out.println("Хабарник { " + d.getFirstName() + " " + d.getLastName() + " }");
            }
        }
    }

    public void findBestBriber() {
        Deputy bestBriber = null;
        for (Fraction f: fractions) {
            for (Deputy d: f.getDeputyList()) {
                if (bestBriber.getBribeSize() < d.getBribeSize()) {
                    bestBriber = d;
                }
            }
        }
        if (bestBriber == null) {
            System.out.println("Хабарників взагалі немає");
        } else {
            System.out.println("Найбільший хабарник < " + bestBriber.getFirstName() +
                    " " + bestBriber.getLastName() + " > \nРозмір хабаря = " + bestBriber.getBribeSize());
        }
    }

    public void giveBribe(String name, String lastName, int sum) {
        for (Fraction f: fractions) {
            for (Deputy d: f.getDeputyList()) {
                if (d.getFirstName().equalsIgnoreCase(name) &&
                d.getLastName().equalsIgnoreCase(lastName)) {
                    d.giveBribe(sum);
                }
            }
        }

    }

}
