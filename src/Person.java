public class Person {

    public static void main(String[] args) {
        Person person = new Person("Travis");
        System.out.println(person.getName());
        person.setName("Other Travis");
        System.out.println(person.getName());
        person.sayHello();
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
//    public class person {
//        public static void main(String[] args) {
//            Person person1 = new Person("John");
//            Person person2 = new Person("John");
//            System.out.println(person1.getName().equals(person2.getName()));
//            System.out.println(person1 == person2);
//
//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1 == person2);
//
//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//            person2.setName("Jane");
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//        }
//    } this code matched my expectations of not working

}