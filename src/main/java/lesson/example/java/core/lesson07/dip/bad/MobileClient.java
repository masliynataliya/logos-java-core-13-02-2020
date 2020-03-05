package lesson.example.java.core.lesson07.dip.bad;

public class MobileClient  {

    private DataAccess dataAccess = new DataAccess();

    public void fetchData() {
        if (dataAccess.access()) {
            System.out.println("here is you data");
        }
    }
}
