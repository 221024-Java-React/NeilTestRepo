
public class Lab4 {

	public static void main(String[] args) {
		
		//creating a filling array numbers
		int[] numbers = new int[100];
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		int evenSum = 0;
		int oddSum = 0;
		int itter = 0;//used to itterate through array
		
		//adds odd# to oddSum, and even# to EvenSum
		while(itter < numbers.length) {
			if(numbers[itter]%2 == 0)
				evenSum += numbers[itter];
			else
				oddSum +=numbers[itter];
			
			itter++;
		}
		
		//prints out sums
		System.out.println(evenSum);
		System.out.println(oddSum);


	}

}
