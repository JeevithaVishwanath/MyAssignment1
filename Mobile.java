package week1.day1;

public class Mobile {

        public void makeCall () {
        	String mobileModel="redmi";
        	float mobileWeight=3.5f;
		System.out.println("hello dear");

	}
        public void sendSms() {
        	boolean isFullCharged=false;
            int mobileCost=12000;
        	System.out.println("good morning");
    }
    public static void main(String[] args) {   
    	Mobile obj= new Mobile ();
    	obj.makeCall();
    	obj.sendSms();
    	System.out.println("This is my mobile");
    }
        
}
