package abstraction;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle obj;
		
		obj= new Car();
		obj.start();
		
		obj=new Scooter();
		obj.start();
		
	}

}


/*
 * The simple abstraction example that is given above has a class Vehicle. In this
 * class Vehicle, we have an abstract method to start(). Then we inherit this vehicle 
 * class in the Car class. and also this vehicle class inherit the Scooter class 
 * Inside the Car class and scooter class ,we implement theStart()method.
 */
     //============ in main method============== //
 /*  i have create one VehicleTest class and that class having one main method 
 *  then create the refernce of vehicle class because we can not create object of abstract class
 *  thats why i create the   reference of  Vehicle class and object is create car and scooter class and 
 *  then calling the car and scooter class methods 
 *  
 * 
*/