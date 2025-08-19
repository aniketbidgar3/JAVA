
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void output() {
        System.out.println("Hello My name is " + this.name + " and age is " + this.age);
    }
}

public class Class {

    public static void main(String[] args) {
        Student t = new Student("Aniket", 22);
        t.output();

    }
}
