package com.multipleinheritance.example;

public class TwoWheeler implements MotorBike,Cycle {

	int totalDistance;
	int avgSpeed;
	

	@Override
	public void totalDistance() {
		
		totalDistance = speed * distance;
		System.out.println("Total Distance Travelled : "+totalDistance );
		
	}
	
	@Override
	public void speed()
	{
		int avgSpeed = totalDistance / speed;
		System.out.println("Average Speed maintained : "+avgSpeed);
			
	}
	
	public static void main(String[] args) {
		TwoWheeler t1 = new TwoWheeler();
		t1.totalDistance();
		t1.speed();
	}

}
