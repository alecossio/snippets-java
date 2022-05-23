public class IsOdd {
	public static boolean isOdd(int i) {
		int a;
		for(a = i; a>2; a=a-2) {}
		if(a==1)
			System.out.println(i + " is odd");
		else if(a==2)
			System.out.println(i + " is even");
		else
			System.out.println("Error");
		return true;
	}

	public static void main(String[] args) {
		isOdd(Integer.parseInt(args[0]));
	}
}
