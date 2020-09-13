package homework.markoTolochko.lesson15MapZooClub;

import java.util.List;
import java.util.Map;

public class ZooClub {
    Map<Person, List<Animal>> map;


    public ZooClub(Map<Person, List<Animal>> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "map=" + map +
                '}';
    }
}
