import java.util.ArrayList;

public class AreDistinct {

	public static void main(String[] args) {
		
		AreDistinct app = new AreDistinct();
		app.run(args);
	}

	public void run(String[] args) {
		boolean areDistinct = false;

		ArrayList<Integer> argsI = new ArrayList<>();

		for(String a : args)
			argsI.add(Integer.parseInt(a));

		for(Integer x : argsI){
			for(Integer y : argsI)
				if(x != y){
					areDistinct = true;
					break;
				}
			if(areDistinct)
				break;
		}
		if(areDistinct)
			System.out.println("Are distinct");
		else
			System.out.println("All equal");

	}
}
