package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Борис", "Математика");
        teacher.printInfo();
        System.out.println(teacher.getSubjectName());
        Student student = new Student("Василий", "Тринадцатая");
        student.printInfo();
        System.out.println(student.getGroupName());
    }
}
