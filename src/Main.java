import example.Client;
import example.Employee;
import example.Person;
import referencing.Reference;
import referencingParent.ReferencingParent;

public class Main {
    // мы используем каст (изменение) типа класса
    public static void printNames(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
    public static void main(String[] args) {
        Reference a1 = new Reference();

       ReferencingParent a = new Reference();
       // ссылка на класс Person и объект Person
        // мы ссылаемся непосредственно на сами подклассы
       Person person = new Person();
       Client client = new Client();
        Employee employee = new Employee();

        // 2 вариант
        // используем ссылку на суперкласс Person

        Person client2 = new Client();
        Person employee2 = new Employee();

        //Employee abc = new Client();
        // Client abc = new Person();

        // получаем доступ к полям класса через ссылку на суперкласс
        employee2.setName("Ginger R. Lee");
        employee2.setYearOfBirth(1960);

        //employee2.setSalary(30000); // родительский класс не знает о методе setSalary()
        // но у него есть методы setName() setYearOfBirth()

        // Назначение типа класса
        // 1. обработка массива объектов у которых разные типы из одной иерархии
        // тип Person, тип Employee, тип Client
        // 2. метод который есть у объекта в базовом (родительском) классе, но также может
        // работать с объектами подкласса например: .setName();
        Person person2 = new Client();
        //Employee employee3 = (Employee) person2; // здесь будет ошибка ClassCastException
        // class example.Client cannot be cast to class example.Employee (example.Client and example.Employee are in unnamed module of loader 'app')


        //Client clientAgain = (Client) person; // здесь не будет ошибок

        Person person3 = new Employee();
        person3.setName("Ann");
        Client client3 = new Client();
        client3.setName("Pauline");
        Employee employee4 = new Employee();
        employee4.setName("Alice");

        Person[] persons = {person3, client3, employee4, employee2};
        printNames(persons);



    }
}