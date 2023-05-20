package day6;

import java.util.Random;

public class Teacher {
    Random rand = new Random();
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    void evaluate(Student student){
        int x = rand.nextInt(6) + 2;
        String mark = "";
        switch(x){
            case 2 :
                mark = "неудовлетворительно";
                break;
            case 3 :
                mark = "удовлетворительно";
            case 4 :
                mark = "хорошо";
            case 5 :
                mark = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +  " по предмету " + subject + " на оценку " + mark + ".");
    }
}
