package basics;

public class amstrong {

	public static void main(String[] args) {
		int givenNumber = 153;
		int placeHolder =0;
		int target = givenNumber;
		while (givenNumber > 0) {
			int individualDigit = givenNumber % 10;
			givenNumber = givenNumber / 10;
			placeHolder = (int) (placeHolder + (Math.pow(individualDigit, 3)));
		}
if (target == placeHolder) {
	System.out.println(target +  " is amstrong number");
}else {
		System.out.println(target +  "is not amstrong number");
	}
}
	}

