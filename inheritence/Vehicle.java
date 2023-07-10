package inheritence;

public class Vehicle {
    int tyre;
    int seats;
    Engine eng;

    public Vehicle(int tyre, int seats,String mafn, String fuel, String pow) {
        this.tyre = tyre;
        this.seats = seats;
        eng = new Engine(mafn, fuel,pow);
    }

    Vehicle( ){

        System.out.println("Vehicle is initialized");
        eng= new Engine();
    }

}
class MotorBike extends Vehicle{
   String name;
   String brand;
   String type;

    MotorBike(String brand,String name, int seats, String mfname, int tyre, String type,String fuel,String pow)

    {  super(tyre,seats, mfname,fuel,pow);
        this.brand=brand;
        this.name=name;
        this.type=type;

    }

    void showinfo()
    {
        System.out.println("Showing the bike info");
        System.out.println("Brand name:\t"+ brand);
        System.out.println("Name of bike:\t"+name);
        System.out.println("Name of the type:\t"+type);
        System.out.println("Number of tyres:\t"+tyre);


    }
}

class Scooter extends MotorBike {
        int milleage;
        float mrp;
        int gear;
        boolean isEV;
    Scooter(String brand,int tyre, String name, int gear, boolean isEV,int milleage,float mrp,String type,int seats, String mfname, String fuel,  String pow ) {
       super(brand, name,seats,mfname, tyre, type, fuel, pow);
        this.milleage=milleage;
        this.mrp=mrp;
        this.gear=gear;
    }


    void showInfo() {
        super.showinfo();
        System.out.println(" specific info");
        System.out.println("Nunber of gear:\t"+gear );
        System.out.println("MRP of bike:\t"+ mrp);
        System.out.println("Is ev:\t"+isEV );
        System.out.println("mileage:\t"+milleage);

    }
}


class Engine{
    String manufacturerName;
   String fuelType;
   String power;
Engine(){}
    public Engine(String manufacturerName, String fuelType,String power) {
        super();
        this.manufacturerName = manufacturerName;
        this.fuelType = fuelType;
        this.power=power;
    }
    void showEngineInfo(){
        System.out.println("*****************");
        System.out.println("Showing engine info");
        System.out.println("Manufacture of engine:\t"+ manufacturerName);
        System.out.println("fuel type of engine:\t"+fuelType );
        System.out.println("Power in cc:\t"+power);
}
}
class Tester{
    public static void main(String[] args) {

        Vehicle v= new Vehicle(2,2,"Honda", " petrol","100cc");
        v.eng.showEngineInfo();
        Vehicle v2 = new Vehicle();
        v2.eng.showEngineInfo();

        Scooter sc = new Scooter("bajaj", 2,"chetak",4,true,60,60000,"scooter",2,"Honda","petrol","110cc");

        sc.showInfo();
        sc.eng.showEngineInfo();
    }


}
