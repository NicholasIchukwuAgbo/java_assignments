     import java.util.*;

public class ArrayKata{

	public static void main(String[] args){
	
	ArrayKata array = new ArrayKata();
      
	int[] arrayList = {101, 110, 125, 130, 141, 150, 160, 170, 180, 295, 10};

       	System.out.println("max: " + array.max(arrayList));

	System.out.println("Min: " + array.min(arrayList));

	System.out.println("Sum: " + array.sum(arrayList));

	System.out.println("Sum Of Even: " + array.even(arrayList));

	System.out.println("Sum Of odd: " + array.odd(arrayList));

	System.out.println("Number Of Even: " + array.evenNumber(arrayList));

	System.out.println("Number Of Odd: " + array.oddNumber(arrayList));

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