import java.util.*;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person pers1 = new Person("Claudia", 25);
        Person pers2 = new Person("Alina", 56);
        Person pers3 = new Person("Ion", 30);


        TreeSet<Person> peopleByName = new TreeSet<>(PersonComparator.byName);
        TreeSet<Person> peopleByAge = new TreeSet<>(PersonComparator.byAge);

        peopleByName.add(pers1);
        peopleByName.add(pers2);
        peopleByName.add(pers3);

        peopleByAge.add(pers1);
        peopleByAge.add(pers2);
        peopleByAge.add(pers3);

        // persons by name
        System.out.println("Sorted by Name:");
        for (Person person : peopleByName) {
            System.out.println(person);
        }

        // persons  by age
        System.out.println("\nSorted by Age:");
        for (Person person : peopleByAge) {
            System.out.println(person);
        }


        Address address1 = new Address("Bihorului 9", "Sibiu");
        Address address2 = new Address("Progresului 1", "Craiova");

        List<Hobby> hobbies = new ArrayList<>();

        Hobby hobby1 = new Hobby("workout", 4, List.of(address1));
        Hobby hobby2 = new Hobby("Running", 3, List.of(address2));
        hobbies.add(hobby1);
        hobbies.add(hobby2);

        Map<Person, List<Hobby>> hobbyList = new HashMap<>();
        hobbyList.put(pers1, List.of(hobby1));
        hobbyList.put(pers2, List.of(hobby2));

        for (Hobby hobby : hobbies) {
            System.out.println("Hobby: " + hobby.getName());
        }

    }
}



