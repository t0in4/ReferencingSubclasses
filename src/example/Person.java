package example;

public class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

    public String getName() {
        return name;
    }
    // генерируем геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
