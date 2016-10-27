package Airplane;

public class Airplane {
	
	private boolean landed;
	
	public Airplane() {
		this.landed = true;
	}
	
	public void takeoff() {
		this.landed = false;
	}
	
	public void landing() {
		this.landed = true;
	}
	
	public boolean isLanded() {
		return this.landed;
	}

}
