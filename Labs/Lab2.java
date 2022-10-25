
public class Lab2 {

	public static void main(String[] args) {
		
		Lab2 test1 = new Lab2();
		System.out.println(test1.add(5, 7)); 
		System.out.println(test1.sub(15, 6)); 
		System.out.println(test1.multiply(23, 8));
		System.out.println(test1.divide(25, 5)); 
		
	}
	
	//takes two ints, returns the sum
	int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//takes two int, returns the difference
	int sub(int a, int b) {
		int c = a - b;
		return c;
	}
	
	//takes two doubles, returns the product
	double multiply(double a, double b) {
		double c = a*b;
		return c;
	}
	
	//take two doubles, returns the quotient
	double divide(double a, double b) {
		double c = a/b;
		return c;
	}
}
