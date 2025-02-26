public class Kata{

	public static void main(String[] args){

	System.out.println("is even: " + isEven(8));
   
        System.out.println("positive difference: " + positiveDifference(3, 7));

        System.out.println("is palindrome: " + isPalindrome(11111));

	System.out.println("is square number: " + isSquareNumber(25));	

	System.out.println("square number: " + squareNumber(5));
	
	System.out.println("is Prime: " + isPrime(2));

	System.out.println("Find Factors: " + findFactors(10));

	System.out.println("Factorial: " + findFactorial(5));
	
	}

	public static boolean isEven(int number){

	return number %2 == 0;

	}

	public static boolean isPrime(int prime) {

  	if (prime <= 1) {

        return false;

  	 }
   	for (int count = 2; count * count <= prime; count++) {

         if (prime % count == 0) {

            return false;
         }
        }
        return true;
       }


	public static int positiveDifference (int a, int b){

	return Math.abs(a - b);
	}
	 
  	public static boolean isPalindrome(int number) {

        int reverse = 0;

        int original = number;

        while (number != 0) {

            int remainder = number % 10;

            reverse = reverse * 10 + remainder;

            number /= 10;
        }
        return original == reverse;
    }


	public static boolean isSquareNumber(int num) {
 	int count = 1;
    	while (count * count <= num) {
        if (count * count == num) {
            return true;
        }
        count++;
    	}
    	return false;
	}


	public static int squareNumber (int num){

	return num * num;
	}

	public static int findFactors(int number){
	int count = 0;
	for(int counter = 1; counter <= number; counter++){
	if(number % counter == 0){
	count++;
	}
	}
	return count;
	}

	public static int findFactorial(int num){

	int count = 1;

	for(int i = 1; i <= num; i++){

	count = count * i;

	}
	return count;
    }

}