import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
	static Set <String> resultSet = new HashSet<String>();
	public static void main(String args[]) {
		String input = "AABC";
		permute(input, 0, input.length() - 1);
		System.out.println("Result : "+ Arrays.toString(resultSet.toArray()));
	}

	private static void permute(String input, int l, int r) {
		if (l == r) {
			resultSet.add(input);
		} else {
			for (int i = l; i <= r; i++) {
				input = swap(input, l, i);
				permute(input, l + 1, r);
				input = swap(input, l, i);
			}
		}
	}

	private static String swap(String input, int i, int j) {
		char inputArr[] = input.toCharArray();
		char temp = inputArr[i];
		inputArr[i] = inputArr[j];
		inputArr[j] = temp;
		return String.valueOf(inputArr);
	}
}
