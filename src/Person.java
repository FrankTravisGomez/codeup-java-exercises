public class Person {

    public static void main(String[] args) {
        Person person = new Person("Travis");
        System.out.println(person.getName());
        person.setName("Other Travis");
        System.out.println(person.getName());
        person.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2); i thought this would change name, but it returned a boolean

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); i was unsure what to expect after running the previous code ,but I find it interesting that it produces true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        // after running this last code I thought it would return another boolean, I'm surprised
        // that it returned John, John, Jane, Jane ,but I will remember this



    }

    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        //TODO: return the person's name
        return name;
    }

    public void setName(String name) {
        //TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
        //TODO: print a message to the console using the person's name
        System.out.println("Sup, my name is " + name + " aka not the real slim shady");
    }

}