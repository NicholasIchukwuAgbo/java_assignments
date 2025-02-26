public class sum1{

public static void main(String[] args){

int[] arrays = {1,2,3,4,5};

int sum = 0;

for(int count = 0; count< arrays.length; count++){
sum += arrays[count];
}
System.out.print(sum);
}
}