package oops.teacher;

public class Teacher {
    public String name="vaibhav";
    int age= 24;
    private String feedback;
    protected int salary;



    protected void setSalary(int s)
    {
        salary=s;
    }

    public void showDetail()
    {
        System.out.println("Name:\t"+name);
        System.out.println("Age:\t"+age);
    }
    void  showFeedback()
    {
        System.out.println("feedbackt\t:"+ feedback);
    }


}
