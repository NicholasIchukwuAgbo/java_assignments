 public class ArrayKataa{

	public static void main(String[] args){

	int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
	System.out.println("Max is: " + max(array));
	System.out.println("Min is: " + min(array));
	System.out.println("Sum is: " + sumOfElement(array));
	System.out.println("Sum Of Even is: " + sumOfEvenElement(array));
        System.out.println("Sum Of Odd is: " + sumOfOddElement(array));
	System.out.println("Number Of Even: " + numberOfEven(array));
	System.out.println("Numbers of odd: " + numberOfOdd(array));

     }


	public static int max(int[] array){

	int maximum = array[0];

	for(int i = 0; i < array.length; i++){
    
	if(array[i] > maximum){

	maximum = array[i];
      }
     }
    return maximum;
   }

	public static int min(int[] array){

	int minimum = array[0];

	for(int i = 0; i < array.length; i++){

	if(array[i] < minimum){

	minimum = array[i];
      }
     }
    return minimum;
    }

	public static int sumOfElement(int[] array){

	int sum = 0;

	for(int total : array){

	sum += total;
     }
    return sum;
   }

	public static int sumOfEvenElement(int[] array){

	int sumOfEven = 0;

	for(int i : array){

	if(i % 2 == 0){

	sumOfEven += i;
       }
      }
      return sumOfEven;
     }


	public static int sumOfOddElement(int[] array){

	int sumOfOdd = 0;

	for(int i : array){

	if(i % 2 != 0){

	sumOfOdd += i;
       }
      }
    return sumOfOdd;
     }

	public static int numberOfEven(int[] array){

	int evenNumber = 0;

	for(int i : array){

	if(i % 2 == 0){

	evenNumber++;
       }
      }
      return evenNumber;
     }

	public static int numberOfOdd(int[] array){

	int oddNumber = 0;

	for(int i : array){

	if(i % 2 != 0){

	oddNumber++;
       }
      }
      return oddNumber;
     }



  }
