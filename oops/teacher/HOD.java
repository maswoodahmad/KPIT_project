package oops.teacher;


import oops.lms.Student;

public class HOD extends Student {


    Teacher t = new Teacher();
    void setRecord()
    {
        t.name="sheetal";
        t.age = 25;
    }
    void printDetail() {
        System.out.println("name\t:"+t.name);

        System.out.println("age\t:"+t.age);

    }

void showStudentData()
{
    Student s = new Student();
    System.out.println("student name\t:"+name);
    System.out.println("marks\t:"+ marks);
    //System.out.println(s.marks);
//    System.out.println(s.dob);



}
    public static void main(String[] args) {

        HOD h = new HOD();
        h.showStudentData();
        System.out.println("Teacher info");
        h.printDetail();
    }


}
