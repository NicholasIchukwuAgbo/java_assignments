import java.util.Arrays;

public class ReverseElement {
    public static void main(String[] args) {

        int[] list = {100, 200, 300, 400, 500};

	int[] reverse = new int[list.length];

	for(int i = 0; i < list.length; i++){

	reverse[i] = list[list.length -1 -i];

      }
System.out.println(Arrays.toString(reverse));
       
    }
}
