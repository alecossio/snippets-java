public class SumOfInts {
	public static int sumOfInts(int a) {
		int j = 0;
		for(int i = 1; i < a; i++)
		       j=j+i;
		return j;
	}

	public static void main(String args[]) {
		int sum = sumOfInts(Integer.parseInt(args[0]));
		System.out.println("Sum is : "+ sum);
		}
}	
