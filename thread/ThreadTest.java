package thread;

public class ThreadTest {
	public static void main(String[] args) {
		//3. create the objects of your thread class
		Car myCar1 = new Car("Swift");
		Train myTrain = new Train("\tChennai Express");
		Car myCar3 = new Car("\t\tKIA");
		Ship ship = new Ship("cargo");

		Thread t1= new Thread(myCar1);
		Thread t2= new Thread(ship);
		Thread t3=  new Thread(myCar3);
		//4. never call run, rather 
		//call its start() method, which invokes the run()
		t1.start();//will invoke run()
		myTrain.start();//will invoke run()
		t2.start();
		t3.start();
				
	}
}

class Vehicle{

}

//1. extend from java.lang.Thread class
class Car extends Vehicle implements Runnable {
	
	String model;
	
	Car(String model) {
		System.out.println("Car() constructed...");
		this.model = model;
	}
	//2. override its run method
	public void run() {
		//put your logic here, that participates in threading
		for (int i = 0; i < 100; i+=5) {
			System.out.println(model+" Car is running..."+i);
		}
	}
}

class Train extends Thread {
	
	String model;
	
	Train(String model) {
		System.out.println("Train() constructed...");
		this.model = model;
	}
	//2. override its run method
	public void run() {
		//put your logic here, that participates in threading
		for (int i = 0; i < 200; i+=10) {
			System.out.println(model+" Train is running..."+i);
		}
	}
}

class Ship extends  Vehicle implements  Runnable{
	String model;
	Ship(String model)
	{
		this.model=model;
		System.out.println("Ship() constructed...");
		System.out.println("type of ship is\t"+ model);
	}

	@Override
	public void run() {
		for( int i =0;i<10; i++)
		{
			System.out.println("number of ships are-\t"+ model+"\t->\t"+ i*2);
		}
	}
}