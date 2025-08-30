class Student{
    String name;
    private int age;

    void setAge(int age){
        this.age=age;
    }

    int getAge(){
        return age;
    }


    void output(){
        System.out.println("Hello I am "+name+"I am "+age+" Years old");
    }
}


public class Abstraction{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Aniket";
        // s1.age=22;
        s1.setAge(22);

        // System.out.println(s1.age);
        System.out.println(s1.getAge());
        s1.output();
        
    }
}