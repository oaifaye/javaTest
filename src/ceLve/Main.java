package ceLve;

public class Main {

	public static void main(String[] args) {
		Strategy real;
		
		real = new Strategy(new Real1());
		real.operate();
		
		real = new Strategy(new Real2());
		real.operate();
	}
}
