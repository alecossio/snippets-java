import java.util.ArrayList;

public class OddProduct {
	
	class Pair {
		public int x;
		public int y;
		public String toString() {
			return ("[ " + x + " : " + y + " ]");
		}
	}

	public ArrayList<Pair> oddProduct(ArrayList<Integer> input) {
	
		Pair temp;
		ArrayList<Pair> result = new ArrayList<>();

		for(int x = 0; x < input.size(); x++){
			for(int y = 0; y < input.size(); y++) {
				if((input.get(x) * input.get(y)) % 2 != 0){
					temp = new Pair();
					temp.x = input.get(x);
					temp.y = input.get(y);
					result.add(temp);
				}
			}
		}
		return result;
	}

	public void run(String args[]) {
		
		if(args.length == 0){
			System.out.println("Please give arguments");
			return;
		}
		
		ArrayList<Integer> input = new ArrayList<>();
		for(String arg : args) {
			input.add(Integer.parseInt(arg));
		}
		

		System.out.println("The pair(s) of numbers in the array whose product is odd are : ");
		ArrayList<Pair> result = oddProduct(input);
		for(Pair p : result)
			System.out.println(p);
	}

	public static void main(String args[]) {
		OddProduct app = new OddProduct();
		app.run(args);
	}
}	
