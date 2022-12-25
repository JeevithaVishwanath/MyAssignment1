package week1.day1;

public class Bike {
	
	public void applyBreak() {
	System.out.println("Applied Break");
	}
	
	public void soundHorn() {
	System.out.println("Sound Horn");
	}

	public static void main(String[] args) {
		
		Car x=new Car();
		x.applyBreak();
		x.soundHorn();
		
		Bike y=new Bike();
		y.applyBreak();
		y.soundHorn();
		

	}

}
