package week1.day1;

public class Calculator {

		public void subtract() {
			int m=10;
			int n=3;
			System.out.println(m-n);
		}
	public int multiple(int a,int b) {
		return a*b;
		
	}
	public static void main(String[] args) {
		Calculator x = new Calculator();
		x.subtract();
		System.out.println(x.multiple(4, 2));
	}

}
