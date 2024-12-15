public class ArrayKata{

	public static void main(String[] args){
      
	int[] arrayList = {1000, 1500, 2000, 2500, 3000, 3500, 40, 4500, 5000, 6000};

       	System.out.println("max: " + max(arrayList));

	System.out.println("Min: " + min(arrayList));

	System.out.println("Sum: " + sum(arrayList));

	System.out.println("Sum Of Even: " + even(arrayList));

	System.out.println("Sum Of odd: " + odd(arrayList));

	System.out.println("Number Of Even: " + evenNumber(arrayList));

	System.out.println("Number Of Odd: " + oddNumber(arrayList));

   }


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

   return evenNumber++;

   }


  public static int oddNumber(int[] arrayList){

   int oddNumber = 0;

   for (int oddNumbers : arrayList) {
 
   if(oddNumbers % 2 != 0){

	oddNumber++;

      }

    }

   return oddNumber++;

    }


   }