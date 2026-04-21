package ques4;
class Teacher{
    String name;
    int age;
    String MobNo;
}
class Student extends Teacher{
    int rollNo;

    Student(String name, int rollNo, int age , String MobNo ){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.MobNo = MobNo;
    }
}
public class ExtendDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Aman Uniyal",1,18,"7310875545");
        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        System.out.println("RollNo "+s1.rollNo);
        System.out.println("MobNo: "+s1.MobNo);
    }
}
