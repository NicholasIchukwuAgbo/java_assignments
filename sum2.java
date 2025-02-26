public class sum2{

public static void main(String[] args){

int[] arrays = {1,2,3,4,5};

int count = 0;

int sum = 0;

while(count < arrays.length){

sum += arrays[count];

count++;
}
System.out.print(sum);
}
}