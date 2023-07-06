package baisc;

public class ArrayDemo {


    public static void main(String[] args) {



        ArrayOfObjects [] array = new ArrayOfObjects[5];
        array[0]= new ArrayOfObjects("Kohli", 32, 10200);
        array[1]= new ArrayOfObjects("rohit", 33, 10330);
        array[2]= new ArrayOfObjects("dhoni", 39, 8200);
        array[3]= new ArrayOfObjects("kaif", 46, 2600);
        array[4]= new ArrayOfObjects("rahul", 29, 6200);
        for( ArrayOfObjects a: array)
        {
            a.showData();
        }
    }



}
