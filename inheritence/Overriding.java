package inheritence;

public class Overriding {


    public static void main(String[] args) {


        Doctor dr =  new Doctor();
        dr.surgeon();
    }



}

class Doctor{

    void surgeon()
    {
        System.out.println("surgery");
    }
}

class Nurse extends  Doctor{

    void surgeon()
    {
        System.out.println("nurse");
    }


}
