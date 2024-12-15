public class LargestElement {
    public static void main(String[] args) {
        int[] list = {100, 200, 300, 400, 500};
        System.out.println("Largest element: " + largestElement(list));
    }

    public static int largestElement(int[] list) {
        int largest = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > largest) {
                largest = list[i];
            }
        }
        return largest;
    }
}
