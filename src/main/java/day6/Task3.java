package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Борис", "Математика");
        Student student1 = new Student("Андрей");
        teacher1.evaluate(student1);
    }
}
