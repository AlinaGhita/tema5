import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // compare this = pers1 with o = pers2
        if (o == null || this.getClass() != o.getClass()) return false; //compare pers1 class with pers2 class
        Person person = (Person) o; // cast needed because o type is object
        return age == person.age && Objects.equals(name, person.name);
    }


}
