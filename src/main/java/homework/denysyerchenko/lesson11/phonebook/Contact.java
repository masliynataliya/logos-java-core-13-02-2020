package homework.denysyerchenko.lesson11.phonebook;

public class Contact {
    private String contactName;
    private String phoneNumber;

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + contactName +
                " Number: " + phoneNumber;
    }

    public Contact (String initContactName, String initPhoneNumber) {
        contactName = initContactName;
        phoneNumber = initPhoneNumber;



    }
}
