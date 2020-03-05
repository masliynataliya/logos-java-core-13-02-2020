package lesson.example.java.core.lesson07.dip.bad;

public class WebClient {

    private DataAccess dataAccess = new DataAccess();

    public void fetchData() {
        if (dataAccess.access()) {
            //
            System.out.println("sign in to partner first");
        }
    }

}
