package oops;

public class PolygonTest {
	public static void main(String[] args) {
		
		Polygon myPhone = new Polygon();
		myPhone.area();
		
		myPhone.area(4.9f);
		myPhone.area(4,3);
		myPhone.area(3.14f,9f);
	}
}
class Polygon
{
	void area() {
		System.out.println("area() : calculating areas");
	}
	void area(float number) {
		System.out.println("dial(int): area of square:\t"+number*number);
	}
	void area(int l, int b) {
		System.out.println("area(int, int) : area of rectangle:\t"+ l*b);
	}
	void area(float r, float pi) {
		System.out.println("area(float,float) : area of circle:\t"+pi*r*r);
	}

}