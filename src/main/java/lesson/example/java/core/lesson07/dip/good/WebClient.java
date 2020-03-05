package lesson.example.java.core.lesson07.dip.good;

public class WebClient {

    private DataAccessable dataAccessable = new WebDataAccessable();

    public void fetchData() {
        dataAccessable.access();
    }
}