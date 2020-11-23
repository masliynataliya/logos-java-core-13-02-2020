package homework.ihorpayensky.homeworks.homework15;

public interface ZooClubImpl {

    void addPerson(Person person);
    void addPetToPerson(int personId, Pet pet);
    void removePetFromPerson(int personId, int pet);
    void removePerson(int personId);
    void removePetFromAllOwners(int pet);
    void showZooClub();

}
