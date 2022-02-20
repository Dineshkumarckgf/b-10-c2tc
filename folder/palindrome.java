package basics;

public class palindrome {

	public static void main(String[] args) {
	int givenNumber = 124;
	int placeHolder =0;
	int target = givenNumber;
     while (givenNumber > 0) {
    	 int individualDigit = givenNumber % 10;
    	 givenNumber = givenNumber / 10;
    	 placeHolder = (placeHolder * 10) + individualDigit;
    	 }
	if (target == placeHolder) {
		System.out.println(target +  " is palindrome number");
	}else {
		System.out.println(target +   " is not a palindrome number");
	}

	}

}
