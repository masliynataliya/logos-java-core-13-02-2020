package homework.ihorpayensky.homeworks.homework15;

import java.util.*;
import java.util.Map.Entry;

class ZooClub implements ZooClubImpl {

    private static ZooClub zooClub;
    private Map<Person, List<Pet>> map;

    private ZooClub() {
        this.map = new HashMap<>();
    }
    public static ZooClub getZooClubInstance() {
        if (zooClub == null) {
            return new ZooClub();
        }
        return zooClub;
    }

    public void showInfo() {
        System.out.println("Choose option:");
        System.out.println("1 - Add person to club");
        System.out.println("2 - Add pet to person");
        System.out.println("3 - Remove pet from person");
        System.out.println("4 - Remove person");
        System.out.println("5 - Remove pet");
        System.out.println("6 - Show Zoo Club");
        System.out.println("7 - close session\t");
    }

    @Override
    public void addPerson(Person person) {
        if(!map.containsKey(person)) {
            map.put(person, new ArrayList<Pet>());
            System.out.println("Person '" + person.getName() + "' has added to Zoo Club");
        }
        else {
            System.out.println("Person '"+ person.getName() + "' is already exist...");
        }
    }

    @Override
    public void addPetToPerson(int personId, Pet pet) {
        if (map.isEmpty()) {
            System.out.println("Map is empty...");
        } else {
            Set<Person> people = map.keySet();
            for (Person p: people) {
                if (p.getId() == personId) {
                    map.get(p).add(pet);
                    System.out.println("Pet added");
                }
            }
        }
    }

    @Override
    public void removePetFromPerson(int personId, int petId) {
        if (map.isEmpty()) {
            System.out.println("Map is empty...");
        } else {
            Set<Entry<Person, List<Pet>>> entries = map.entrySet();
            Iterator<Entry<Person, List<Pet>>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Entry<Person, List<Pet>> next = iterator.next();
                if (next.getKey().getId() == personId) {
                    for (Pet pet: next.getValue()) {
                        if (pet.getId() == petId) {
                            System.out.println("Pet removed:\t" + pet.toString() );
                            next.getValue().remove(petId);
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void removePerson(int personId) {
        if (map.isEmpty()) {
            System.out.println("Map is empty...");
        } else {
            Set<Entry<Person, List<Pet>>> entries = map.entrySet();
            Iterator<Entry<Person, List<Pet>>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Entry<Person, List<Pet>> next = iterator.next();
                if (next.getKey().getId() == personId) {
                    System.out.println("Person removed:\t" + next.toString());
                    map.remove(next.getKey());
                    break;
                }
            }
        }
    }

    @Override
    public void removePetFromAllOwners(int pet) {
        Set<Entry<Person, List<Pet>>> entries = map.entrySet();
        Iterator<Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<Person, List<Pet>> next = iterator.next();
            List<Pet> value = next.getValue();
            Iterator<Pet> petsIterator = value.iterator();
            while (petsIterator.hasNext()) {
                Pet tempPet = petsIterator.next();
                if (tempPet.getId() == pet) {
                    System.out.println("Pet removed " + tempPet.toString());
                    petsIterator.remove();
                }
            }
        }
    }

    public void showAllPets() {
        if (map.isEmpty()) {
            System.out.println("Map is empty...");
        } else {
            Set<Pet> petsListToRemove = new HashSet<>();
            Set<Entry<Person, List<Pet>>> entries = map.entrySet();
            Iterator<Entry<Person, List<Pet>>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Entry<Person, List<Pet>> next = iterator.next();
                petsListToRemove.addAll(next.getValue());
            }
            System.out.println("Id\t|\tPet");
            for (Pet p: petsListToRemove) {
                System.out.println(p.getId() + "\t|\t" + p.toString());
            }
        }
    }

    @Override
    public void showZooClub() {
        printMap(map);
    }

    public void showForEachPersons() {
        if (map.isEmpty()) {
            System.out.println("Map is Empty");
        }
        Set<Entry<Person, List<Pet>>> entries = map.entrySet();
        Iterator<Entry<Person, List<Pet>>> iterator = entries.iterator();
        System.out.println("Id\t|\tPerson");

        while (iterator.hasNext()) {
            Person p = iterator.next().getKey();
            System.out.println(p.getId() + "\t|\t" + p.toString());
        }
    }

    public void showForeachPersonPets(int personId) {
        if (map.isEmpty()) {
            System.out.println("Map is Empty");
        }
        Set<Entry<Person, List<Pet>>> entries = map.entrySet();
        Iterator<Entry<Person, List<Pet>>> iterator = entries.iterator();
        System.out.println("Id\t|\tPet");
        while (iterator.hasNext()) {
            Entry<Person, List<Pet>> next = iterator.next();
            if (next.getValue().isEmpty()){
                System.out.println("No pets...");
            }
            if (next.getKey().getId() == personId) {
                List<Pet> p = next.getValue();
                for (Pet pet: p) {
                    System.out.println(pet.getId() + "\t|\t" + pet.toString());
                }
            }
        }
    }

    public static void printMap(Map map) {
        if (map.isEmpty()) {
            System.out.println("Map is Empty");
        }
        Set<Entry<String, Integer>> entries = map.entrySet();
        Iterator<Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public boolean checkId(int id) {
        if (id >= 0 && id < map.size()) {
            return true;
        }
        return false;
    }

    public boolean mapIsEmpty() {
        if (map.isEmpty()) {
            return true;
        }
        return false;
    }
}
