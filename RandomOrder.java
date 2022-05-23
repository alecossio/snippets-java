import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomOrder {

	public static void main(String[] args) {

		ArrayList<Integer> input = new ArrayList<>();

		for(int i = 1; i<=52;i++) {
			input.add(i);
		}

		Integer temp;
		
		for(int j = 0; j < 51; j++) {
		
			int randomNum2 = ThreadLocalRandom.current().nextInt(0, 51 + 1);

			temp = input.get(j);
			input.set(j, input.get(randomNum2));
			input.set(randomNum2, temp);
		}

		for(Integer num : input)
			System.out.print(num + " : ");
	}
}





