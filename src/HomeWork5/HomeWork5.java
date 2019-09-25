package HomeWork5;

//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

public class HomeWork5 {private String fio;
    private String post;
    private String email;
    private String tel;
    private double salary;
    private int age;

    Person(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
    }
}


public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ulyanov Mihail", "Manager1", "Ulyanov@mailG.com", "85642", 90000, 21);
        persArray[1] = new Person("Zagorodskiy Nikolay", "Manager2", "Zagorodskiy@mailG.com", "35912", 90000, 22);
        persArray[2] = new Person("Dmitrieva Elena", "Director", "Dmitrieva@mailG.com", "83466", 250000, 52);
        persArray[3] = new Person("Shatov Stanislav", "Vice", "Shatov@mailG.com", "10865", 180000, 43);
        persArray[4] = new Person("Yartseva Ekaterina", "Estimator", "Yartseva@mailG.com", "29914", 120000, 28);

        for(Person item : persArray) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}
