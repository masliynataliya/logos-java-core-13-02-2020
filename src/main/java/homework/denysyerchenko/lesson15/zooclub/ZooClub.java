package homework.denysyerchenko.lesson15.zooclub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private static Map <Person, List <Animal>> map = new HashMap<>();

    public ZooClub() {
    }

    public ZooClub(Map<Person, List<Animal>> map) {
        this.map = map;
    }

    public static Map<Person, List<Animal>> getMap() {
        return map;
    }


}
