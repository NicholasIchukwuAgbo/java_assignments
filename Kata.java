public class Kata{

	public static void main(String[] args){

	System.out.println(isEven(8));
	System.out.println(isEven(5));
   
        System.out.println(positiveDifference(3, 7));
        System.out.println(positiveDifference(7, 3));

        System.out.println(isPalindrome(54145));
        System.out.println(isPalindrome(12345));
	
	}

	public static boolean isEven(int number){

	return number %2 == 0;

	}

	public static int positiveDifference (int a, int b){

	return Math.abs(a - b);
	}
	 
	public static boolean isPalindrome(int number){

	int count = number;

	int backward = 0;

	while(number != 0){
 
	int leftout = number;

	backward = backward * 10 + leftout;

	number /= 10;

	}

	return count == backward;

	}

   


}