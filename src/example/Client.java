package example;

public class Client extends Person {
    protected String contactNumber;
    protected boolean gold;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }
}
