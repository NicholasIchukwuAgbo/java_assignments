import java.util.Arrays;

public class reverseInteger{

public static int[] isReverse(int[] number){

int[] arrayList = new int[number.length];

for(int counter = 0; counter < number.length; counter++){
arrayList[counter] = number[number.length -counter -1];
} 
return arrayList;
}

public static void main(String[] args){

int[] arrayElement = {1,2,3,4,5};

System.out.print(Arrays.toString(isReverse(arrayElement)));


}
}