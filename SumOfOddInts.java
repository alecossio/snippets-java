public class SumOfOddInts {
	public static int sumOfOddInts(int a) {
		int j = 0;
		for(int i = 1; i < a; i++){
		       if(i%2==1 || i==1)
			j=j+i;
		}
		return j;
	}

	public static void main(String args[]) {
		int sum = sumOfOddInts(Integer.parseInt(args[0]));
		System.out.println("Odd Sum is : "+ sum);
		}
}	
