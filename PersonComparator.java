import java.util.Comparator;

public class PersonComparator {
    //create Comparator by name
    public static Comparator<Person> byName = new Comparator<Person>() {
        @Override

        public int compare(Person pers1, Person pers2) {
            return pers1.getName().compareTo(pers2.getName());
        }
    };
    //create Comparator by age
    public static Comparator<Person> byAge = new Comparator<Person>() {
        @Override
        public int compare(Person pers1, Person pers2) {
            return Integer.compare(pers1.getAge(), pers2.getAge());
        }
    };
}

