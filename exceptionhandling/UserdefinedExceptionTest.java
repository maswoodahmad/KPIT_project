package exceptionhandling;

public class UserdefinedExceptionTest {
	public static void main(String[] args) {
		System.out.println("==> main() started <== ");
            boolean i = false;
			int j =0;
			while(!i) {
				try {
					System.out.println("time ran:\t"+ j++);
					Car myCar = new Car();
					myCar.stopTheEngine();
					myCar.setOil(true);
					i=true;

				} catch (RedSignalDishonouredException ex1) {
					System.out.println("Problem1 : " + ex1);
					System.out.println("Now pay the challan...");
				} catch (TyrePuncturedException ex2) {
					System.out.println("Problem2 : " + ex2);
					System.out.println("Now search the tyre repair shop..");

				} catch (CarKeyNotFoundException ex3) {
					System.out.println("Problem3 : " + ex3);
					System.out.println("Hey lets search the car key...");
				}
				catch (EngineFailedException ex4)
				{
					System.out.println("Problem4:\t"+ ex4);
					System.out.println("hey change the engine oil");
				}
				finally {
					System.out.println("let's eat\t"+j);
				}
			}
		System.out.println("==> main() finished <== "+j);

	}
}

	
class Car
{
	boolean keyFound = false;
	boolean isOil;

	public void setOil(boolean oil) {
		isOil = oil;
	}


	
	Car()  throws  CarKeyNotFoundException// it is the CAPABILITY - since it is of CHECKED category
	{
		double val = Math.random()%10;
		if(val > 0.50) { //if your memory is 90% strong, then u might remember where the key is [ better have a key holder at home ]
			keyFound=true;
			openTheCarDoor();
		}
		else {
			keyFound = false;
			CarKeyNotFoundException carKeyNotFoundEx  = new CarKeyNotFoundException("Oh No..Where is the Car Key....???");
			throw carKeyNotFoundEx; //literally throwing it - ACTION
		}
		
	}
	void openTheCarDoor() {
		startTheEngine();
		longDrive();
	}
	
	void startTheEngine() {
		System.out.println("Car is started...engine is started....");
	}

	void stopTheEngine() {
		System.out.println("Car is stopped...engine is stopped....");
	}

	//is there any mandate to handle such RuntimeExceptions (unchecked) ???
	
	void longDrive() { //throws clause is not mandatory since the RedSignalDishonouredException,TyrePuncturedException are UNCHECKED
		System.out.println("==> longDrive() started <== ");
		

		for(int i=1;i<=20;i++) {

			System.out.println(i+" Driving ....");

			double value = Math.random()%10;
			if(value >=0.95 && value<= 0.99) {
				RedSignalDishonouredException redSignDisEx = new RedSignalDishonouredException("Oh No!! Red signal is dishonoured....");
				throw redSignDisEx; //it is not required to keep it in throws clause
			}

			if(value >=0.25 && value<= 0.30) {
				TyrePuncturedException tyrePunctEx = new TyrePuncturedException("Oh No!! The Tyre is punctued....");
				throw tyrePunctEx;
			}


		}
		if(!isOil)
		{
			EngineFailedException engOil = new EngineFailedException("Oh no!! engine stopped running");
			throw engOil;

		}

		
		System.out.println("==> longDrive() over <== ");

	}
}

class CarKeyNotFoundException extends Exception //CHECKED
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}

//UNCHECKED
class RedSignalDishonouredException extends RuntimeException //isA
{
	RedSignalDishonouredException(String msg) {
		super(msg); //forward this msg to the super class
	}
}

//UNCHECKED
class TyrePuncturedException extends RuntimeException //isA
{
	TyrePuncturedException(String msg) {
		super(msg); //forward this msg to the super class
	}
}

class EngineFailedException extends RuntimeException //isA
{
	EngineFailedException(String msg) {
		super(msg); //forward this msg to the super class
	}
}