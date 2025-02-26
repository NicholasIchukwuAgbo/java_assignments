public class sum3{

public static void main(String[] args){

int[] arrays = {1,2,3,4,5};

int count = 0;

int sum = 0;

do{

sum += arrays[count];

count++;

}while(count < arrays.length);

System.out.print(sum);
}
}