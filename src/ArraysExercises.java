import java.util.Arrays;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Travis"), new Person("David"), new Person("Paul")};
        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person personToAdd = new Person("Kenny");
        people = addPerson(people, personToAdd);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person personToAdd) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = personToAdd;
        return newPeople;
    }
}
