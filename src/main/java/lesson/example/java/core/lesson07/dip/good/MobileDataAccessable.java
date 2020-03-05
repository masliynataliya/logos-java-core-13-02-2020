package lesson.example.java.core.lesson07.dip.good;

public class MobileDataAccessable implements DataAccessable {

    @Override
    public boolean access() {
        // is active call now? if not
        return true;
    }

    private void isTuesday() {

    }
}
