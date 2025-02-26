import java.util.Arrays;

public class ArrayKata{

    public static int max(int[] arrayList) {

       int max = arrayList[0];

       for (int maximum = 1; maximum < arrayList.length; maximum++) {

       if (arrayList[maximum] > max) {

       max = arrayList[maximum];

            }

        }

        return max;

    }


    public static int min(int[] arrayList) {

      int min = arrayList[0];

      for (int minimum = 1; minimum < arrayList.length; minimum++) {

      if (arrayList[minimum] < min) {

      min = arrayList[minimum];

            }

        }

        return min;
    }


  public static int sum(int[] arrayList) {

   int sum = 0;

   for (int number : arrayList) {

   sum += number;

    }

   return sum;

   }



  public static int even(int[] arrayList) {

   int even = 0;

   for (int evenNumber : arrayList) {
 
   if(evenNumber % 2 == 0){

	even += evenNumber;
      }

    }

   return even;

   }


  public static int odd(int[] arrayList) {

   int odd = 0;

   for (int oddNumber : arrayList) {
 
   if(oddNumber % 2 != 0){

	 odd += oddNumber;
      }

    }

   return odd;

   }


  public static int evenNumber(int[] arrayList) {

   int evenNumber = 0;

   for (int evenNumbers : arrayList) {
 
   if(evenNumbers % 2 == 0){

	evenNumber++;

      }

    }

   return evenNumber;

   }


  public static int oddNumber(int[] arrayList){

   int oddNumber = 0;

   for (int oddNumbers : arrayList) {
 
   if(oddNumbers % 2 != 0){

	oddNumber++;

      }

    }

   return oddNumber;

    }

    public static int[] getEvenList(int[] numbers) {

	 int evenCount = 0;

        for (int number = 0; number < numbers.length; number++) {

            if (numbers[number] % 2 == 0) {

                evenCount++;
            }
        }

        int[] evenList = new int[evenCount];

        int counter = 0;

        for (int count = 0; count < numbers.length; count++) {

            if (count % 2 == 0) {

                evenList[counter] = count;

                counter++;
            }
        }
        return evenList;
    }


      public static int[] getOddList(int[] numbers) {

	int oddCount = 0;

        for (int number = 0; number < numbers.length; number++) {

        if (numbers[number] % 2 != 0) {

        oddCount++;
         }
        }

        int[] oddList = new int[oddCount];

        int counter = 0;

        for (int count = 0; count < numbers.length; count++) {

        if (count % 2 != 0) {

        oddList[counter] = count;

        counter++;
          }
        }
        return oddList;
      }

	public static int[] findMaxAndMin(int[] arrays) {

	int max = arrays[0];

	int min = arrays[0];

	for (int count = 0; count < arrays.length; count++) {

	if (arrays[count] < min) {
	max = min;
	min = arrays[count];

	}

	if (arrays[count] > max) {
	max = arrays[count];
 	  }
 	}

 	return new int[] {max, min};
      }



	public static void main(String[] args){
      
	int[] arrayList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

       	System.out.println("max: " + max(arrayList));

	System.out.println("Min: " + min(arrayList));

	System.out.println("Sum: " + sum(arrayList));

	System.out.println("Sum Of Even: " + even(arrayList));

	System.out.println("Sum Of odd: " + odd(arrayList));

	System.out.println("Numbers Of Even: " + evenNumber(arrayList));

	System.out.println("Numbers Of Odd: " + oddNumber(arrayList));

	System.out.println("Even List: " + Arrays.toString(getEvenList(arrayList)));

	System.out.println("Even List: " + Arrays.toString(getOddList(arrayList)));
	
	System.out.println("Even List: " + Arrays.toString(findMaxAndMin(arrayList)));

     }


   }