package ques6;

import java.sql.SQLOutput;

public class Course {
    //attributes:

    String ID;
    String Desc;
    String Duration;
    float fees;

    //constructor:
    Course(String ID, String Desc, String Duration, float fees){
        this.ID = ID;
        this.Desc = Desc;
        this.Duration = Duration;
        this.fees = fees;
    }

    Course(){}

    void getData(){
        System.out.println("----------Information of the course---------------");
        System.out.println("ID: "+ID);
        System.out.println("Description : "+Desc);
        System.out.println("Duration: "+Duration);
        System.out.println("fees: "+fees);
    }
}
