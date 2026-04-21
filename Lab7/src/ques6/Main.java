package ques6;

public class Main {
    public static void main(String[] args) {
        //1.Declaring an array of Course Objects:
        Course[] courses;

        //2.Allocating memory for 5 course objects:
        courses = new Course[5];

        //3.Initializing each element with an actual Course Object:
        courses[0] = new Course("HS110","Indian Value System","4 months",450.0f);
        courses[1] = new Course("AI105","Object oriented programming","4 months",1234.0f);
        courses[2] = new Course("AI101","Data Structure","4 months",1500.0f);
        courses[3] = new Course("MA110","Linear Algebra and Stats","4 months",1200.0f);
        courses[4] = new Course("EC108","Digital Electronics and Logic Design","4 months",1500.0f);

        for(int i = 0 ; i<5 ; i++){
            courses[i].getData();
            System.out.println("-----------------------------------");
        }
    }
}
