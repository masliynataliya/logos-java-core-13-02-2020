package lesson.example.java.core.lesson06.interfaces.database;

public class App {

    public static void main(String[] args) {

        DBAccess access = new SQLDBAcessImplmpl();

        if (access.getLogin()) {
            String customerName = "Lyuba";
            access.saveData(customerName);
        }
    }
}
