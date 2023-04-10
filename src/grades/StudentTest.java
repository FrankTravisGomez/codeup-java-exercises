package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Travis");
        Student student2 = new Student("David");
        Student student3 = new Student("Minh");
        Student student4 = new Student("Tamica");


        student1.addGrade(70);
        student1.addGrade(90);
        student1.addGrade(80);


        student2.addGrade(85);
        student2.addGrade(75);
        student2.addGrade(95);

        student3.addGrade(100);
        student3.addGrade(80);
        student3.addGrade(95);

        student4.addGrade(75);
        student4.addGrade(85);
        student4.addGrade(95);


        System.out.println(student1.getName() + "'s average grade is... " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s average grade is... " + student2.getGradeAverage());
        System.out.println(student3.getName() + "'s average grade is... " + student3.getGradeAverage());
        System.out.println(student4.getName() + "'s average grade is... " + student4.getGradeAverage());
    }
}