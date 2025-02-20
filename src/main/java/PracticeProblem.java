public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(lettersToFive("hello lillian", 'l'));
		System.out.println(lettersToFive("Whatever", 'e'));
		System.out.println(countLetter("hello", 'l'));
		System.out.println(oddSum(2, 6));
	}

	public static int lettersToFive(String word, char letter) {
		int index = 0;
		int count = 0; //number of occurance of the character
	 while (index < word.length() && count < 5){
		if (word.charAt(index) == letter){
			count++;
		}
		index++;
	 }

	 if (count == 5){
		 return index;
		}
		else {
			return -1;
		}
	}

	public static int countLetter(String word, char letter) {
		int count = 0; //number of occurance of the character

		for (int i = 0; i < word.length(); i++){
			if (word.charAt(i) == letter){
				count++;
			}
		}
		return count;
	}

	public static int oddSum(int num1, int num2){
		int higherNum = Math.max(num1, num2);
		int lowerNum = Math.min(num1, num2);
		int sum = 0;

		for (int num = lowerNum; num <= higherNum; num++) {
			if (num % 2 != 0) {
				sum += num;
			}
		}
	return sum;
	}
}
