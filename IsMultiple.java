public class IsMultiple {

	public static boolean isMultiple(long m, long n) {
		
		if(n%m == 0)
			return true;
		else 
			return false;
	
	}

	public static void main(String[] args) {


		long n = Long.parseLong(args[0]);
		long m = Long.parseLong(args[1]);

		if(isMultiple(m,n))
			System.out.println("They are multiples");
		else
			System.out.println("They are not multiples");
	
	}
}
