package homework.denysyerchenko.lesson11;

public class Contact {
    public String contactName;
    public String phoneNumber;

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
