package lesson.example.java.core.lesson07.dip.good;


public class MobileClient  {

    private DataAccessable dataAccessable = new MobileDataAccessable();

    public void fetchData() {
        dataAccessable.access();
    }
}
