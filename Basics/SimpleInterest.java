package testPackage;

public class SimpleInterest {

	public static void main(String[] args) {

		int principle = 1000;
		int rate = 5;
		int time = 2;

		int SI = (principle * rate * time) / 100;

		System.out.println("For principle - " + principle + " with rate - " + rate + " on time -" + time
				+ " The Simple interest is: " + SI);
		
		principle = 5000;
		double db_rate = 0.1;
		time = 4;
		
		double si = (principle * db_rate * time) / 100;
		
		System.out.println("For principle - " + principle + " with rate - " + db_rate + " on time -" + time
				+ " The Simple interest is: " + si);

	}

}
