package homework.romanivanov.javacore.jc24hw;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    Set<Seance> seances;

    public Schedule() {
        seances = new TreeSet<>();
    }

    @Override
    public String toString() {
        return " Розклад сеансів " + seances;
    }

    public void addSeances(Seance seance) {
        seances.add(seance);

    }

    public void removeSeances(Time startTime) {
        seances.removeIf(seance -> seance.getStartTime().equals(startTime));
    }
}
