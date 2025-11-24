package com.app.car;

public class SuvCar implements Car {
	
	public SuvEngine engine;
	
	public SuvCar(SuvEngine engine) {
		this.engine = engine;
	}
	
	@Override
	public void startCar() {
		engine.startEngine();
		System.out.println("Suv car is started");

	}

	@Override
	public void startMusicSystem() {
		System.out.println("Suv car music system is started");

	}

	@Override
	public void moveCar() {
		System.out.println("Your suv car is movig");
	}
	

}
