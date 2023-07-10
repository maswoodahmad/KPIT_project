package constructor;
abstract class Vehicle {
    private int gear;

    Vehicle( int gear)
    {
        this.gear=gear;
    }

     public int getGear() {
         return gear;
     }

     public void setGear(int gear) {
         this.gear = gear;
     }

     abstract void drive();
     abstract void setData(int gear);
 }

 class Car extends Vehicle{

boolean isEv;
     Car(int gear, boolean isEv) {
         super(gear);
         this.isEv=isEv;
     }

     @Override
     void drive() {
         System.out.println("car is being driven");
         System.out.println("number of gears:\t"+ getGear());
     }

     @Override
     void setData( int gear) {
         System.out.println("acceleration using foot");
         setGear(gear);
     }
     void showData()
     {
         System.out.println("IS ev\t"+isEv);
     }


}
 public  class TestAbstract{
    public static void main(String[] args) {
         Car c = new Car(5,true);
         c.drive();
         c.showData();
     }

 }
