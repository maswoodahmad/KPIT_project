package oops.lms;

import oops.teacher.Teacher;

public class Student extends Teacher {

public String name="maswood";
protected int marks=25;

private  String fb;
int dob=24;


Teacher t= new Teacher();
public void show()
{
//    t.showFeedback();// showFeedback() is default not availble outside the pacakage;
   t.showDetail(); //public hence available;
    setSalary(34);// available in subclass in differnt package;
   // t.setSalary(34);// not availble via parent object
}




}

