import example.Client;
import example.Employee;
import example.Person;
import referencing.Reference;
import referencingParent.ReferencingParent;

public class Main {
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

        





    }
}