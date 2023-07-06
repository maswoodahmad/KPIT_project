package baisc;

public class ArrayOfObjects {


    String name;
    int age;
    int run;

        ArrayOfObjects(String s , int a,int r)
    {
        name=s;
        age=a;
        run=r;
    }

    void showData()
    {
        System.out.println("--------------");
        System.out.println("Player\t: "+name);
        System.out.print("Age\t:"+age);
        System.out.println("Runs\t:"+run);
    }
}
